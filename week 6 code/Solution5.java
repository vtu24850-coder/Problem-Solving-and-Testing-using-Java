import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'circularPalindromes' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING s as parameter.
     */

    public static List<Integer> circularPalindromes(String s) {
     int n = s.length();
    String t = s + s;

    int[] d1 = new int[2 * n]; // odd length palindromes
    int[] d2 = new int[2 * n]; // even length palindromes

    // Manacher - odd
    int l = 0, r = -1;
    for (int i = 0; i < 2 * n; i++) {
        int k = (i > r) ? 1 : Math.min(d1[l + r - i], r - i + 1);
        while (i - k >= 0 && i + k < 2 * n && t.charAt(i - k) == t.charAt(i + k))
            k++;
        d1[i] = k--;
        if (i + k > r) {
            l = i - k;
            r = i + k;
        }
    }

    // Manacher - even
    l = 0; r = -1;
    for (int i = 0; i < 2 * n; i++) {
        int k = (i > r) ? 0 : Math.min(d2[l + r - i + 1], r - i + 1);
        while (i - k - 1 >= 0 && i + k < 2 * n && t.charAt(i - k - 1) == t.charAt(i + k))
            k++;
        d2[i] = k--;
        if (i + k > r) {
            l = i - k - 1;
            r = i + k;
        }
    }

    List<Integer> result = new ArrayList<>();

    for (int start = 0; start < n; start++) {
        int end = start + n - 1;
        int maxLen = 1;

        for (int i = start; i <= end; i++) {
            // odd
            int len1 = 2 * Math.min(d1[i], Math.min(i - start + 1, end - i + 1)) - 1;
            maxLen = Math.max(maxLen, len1);

            // even
            int len2 = 2 * Math.min(d2[i], Math.min(i - start, end - i + 1));
            maxLen = Math.max(maxLen, len2);
        }

        result.add(maxLen);
    }

    return result;
    }

}

public class Solution5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        List<Integer> result = Result.circularPalindromes(s);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

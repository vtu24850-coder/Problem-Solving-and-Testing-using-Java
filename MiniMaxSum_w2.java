import java.io.*;
import java.util.*;

public class MiniMaxSum_w2{

    static void miniMaxSum(List<Integer> arr) {
        long totalSum = 0;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        // Calculate total sum
        for (java.lang.Integer num : arr) {
            totalSum += num;
        }

        // Find min and max sum of 4 elements
        for (int num : arr) {
            long sumOfFour = totalSum - num;
            min = Math.min(min, sumOfFour);
            max = Math.max(max, sumOfFour);
        }

        // Print result
        System.out.println(min + " " + max);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().trim().split(" ");
        List<Integer> arr = new ArrayList<>();

        for (String s : input) {
            arr.add(java.lang.Integer.parseInt(s));
        }

        miniMaxSum(arr);
    }
}

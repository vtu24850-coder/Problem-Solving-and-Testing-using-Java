import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
        while(T-->0){
            String s=sc.next();
            int n=s.length();
            int mid=n/2;
            int[] freq1=new int[26];
            int[] freq2=new int[26];
            for(int i=0;i<mid;i++){
                freq1[s.charAt(i)-'a']++;
            }
            int start;
            if(n%2==0){
                start=mid;
            }
            else{
                start=mid+1;
            }
            for(int i=start;i<n;i++){
                freq2[s.charAt(i)-'a']++;
            }
            boolean isLapindrome=true;
            for(int i=0;i<26;i++){
                if(freq1[i]!=freq2[i]){
                    isLapindrome=false;
                    break;
                }
            }
            if(isLapindrome){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
	}
}

import java.util.*;
import java.util.Scanner;
import java.util.stream.*;
public class Secondhighest_w2{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int N=sc.nextInt();
        int[] arr=new int[N];
        System.out.println("Enter the elements: ");
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();;
        }
        int result=Arrays.stream(arr)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(-1);
        System.out.println("Second highest element is: "+result);
        sc.close();
       }
}

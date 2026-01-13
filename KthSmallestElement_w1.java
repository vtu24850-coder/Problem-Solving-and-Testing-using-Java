import java.util.Scanner;
import java.util.Arrays;
class KthSmallestElement_w1{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter the number of elements:");
int n=sc.nextInt();
int[] arr=new int[n];

System.out.println("Enter the elements:");
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}

System.out.println("Enter the value of k:");
int k=sc.nextInt();
Arrays.sort(arr);

if(k>0&&k<=n){
System.out.println("kth smallest element is: "+arr[k-1]);
}
else{
System.out.println("element not found");
}
}
}
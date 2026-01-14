import java.util.Scanner;
import java.util.Arrays;
class PrintPair_withsc_w1{

void printallpairs(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of elements: ");
int n=sc.nextInt();
int[] arr=new int[n];

System.out.println("Enter the elements: ");
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}

n=arr.length;
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
System.out.println("("+arr[i]+","+arr[j]+")");
}
}
}

public static void main(String args[]){
PrintPair_withsc_w1 p=new PrintPair_withsc_w1();
p.printallpairs();
}
}
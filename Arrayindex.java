import java.util.Scanner;
class Arrayindex{
public static void main(String args[]){
int arr[]={4,5,6,7,8};
Scanner sc=new Scanner(System.in);
System.out.println("Enter array index: ");
int i=sc.nextInt();
if(i>=0 && i<arr.length){
System.out.println("value of given index is: " + arr[i]);
}
else{
System.out.println("invalid index");
}
}
}

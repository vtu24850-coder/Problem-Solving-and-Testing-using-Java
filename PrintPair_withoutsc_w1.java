import java.util.Arrays;
class PrintPair_withoutsc_w1{

void PrintAllPair(int[] arr){
int n=arr.length;
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
System.out.println("("+arr[i]+"," +arr[j]+")");
}
}
}

public static void main(String args[]){
PrintPair_withoutsc_w1 p=new PrintPair_withoutsc_w1();
int[] arr={1,2,3,4,5};
p.PrintAllPair(arr);
}
}
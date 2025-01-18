import java.util.Scanner;
public class Insertion_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,val,pos=-1;
        System.out.print("enter the number=");
        n=sc.nextInt();
        int arr[]=new int[100];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter the value=");
        val=sc.nextInt();
        System.out.print("enter the position=");
        pos=sc.nextInt();
        for(int i=n;i>=pos;i--)
            arr[i+1]=arr[i];
        arr[pos]=val;
        val++;
        System.out.print("******* print final result *********\n");
        for(int i=0;i<n+1;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}

import java.util.*;
public class Reverse_Array {
    public void reverse(int arr[],int n){
        for(int i=0;i<n/2;i++){
            int first_Value=arr[i];
            int second_Value=arr[n-i-1];
            arr[i]=second_Value;
            arr[n-i-1]=first_Value;
        }
    }
    public void Print(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number=");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Reverse_Array st=new Reverse_Array();
        st.reverse(arr,n);
        st.Print(arr,n);

    }
}

import java.util.Scanner;

public class Largest_Number_Of_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temp,n,large=0,large_pos=0;
        System.out.print("enter the number=");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("arr["+i+"]=");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>large){
                large=arr[i];
                large_pos=i;
            }
        }
        System.out.print("RESULT\n");
        System.out.println("Large="+large+" at Position "+large_pos);

    }
}

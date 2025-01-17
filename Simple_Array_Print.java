import java.util.Scanner;
public class Simple_Array_Print {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("enter the number=");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("arr["+i+"]=");
            arr[i]=sc.nextInt();

        }
        System.out.println("******Array elements*******");
        for(int i=0;i<n;i++){
            System.out.print("arr["+i+"]=");
            System.out.println(arr[i]);
        }
    }
}

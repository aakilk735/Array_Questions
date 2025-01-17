import java.util.Scanner;
public class Searching_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,val,found=0,pos=-1;
        System.out.print("enter the number=");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("arr["+i+"]=");
            arr[i]=sc.nextInt();
        }
        System.out.print("enter the searched value=");
        val=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==val){
                found=1;
                pos=i;
                System.out.print(val+" in the array at position "+i);
                break;
            }

        }
        if(found==0){
            System.out.print(val+" does not in the array");
        }
    }
}

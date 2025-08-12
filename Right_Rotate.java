import java.util.ArrayList;
public class Right_Rotate {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        int arr[]={1,2,3,4,5};
        int r=2;
        for(int i=0;i<r;i++){
            int last =arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=last;
        }
        for(int k=0;k<arr.length;k++){
            list.add(arr[k]);
        }
        System.out.print(list);
    }
}

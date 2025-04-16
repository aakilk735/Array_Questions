import java.util.ArrayList;
public class TwoSum {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        int arr[]={1,2,7,4,6};
        int target=9;
        int pos1=0;
        int pos2=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]+arr[j]==target)){
                    pos1=i;
                    pos2=j;
                }
            }
        }
        list.add(pos1);
        list.add(pos2);
        System.out.println(list);
    }
}

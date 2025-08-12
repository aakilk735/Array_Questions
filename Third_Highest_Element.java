public class Third_Highest_Element {
    public static void main(String[] args) {
        int arr[]={4,2,3,7,5};
        int large=0,large_pos=0,second=0,second_pos=0,third=0,third_pos=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
                large_pos=i;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=large) {
                if (arr[i] > second) {
                    second = arr[i];
                    second_pos = i;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=large && arr[i]!=second && arr[i]!=third) {
                if (arr[i] > third) {
                    third = arr[i];
                    third_pos = i;
                }
            }
        }
        System.out.println("Large Number "+ large+ " at position "+large_pos);
        System.out.println("Second Large Number "+ second+ " at position "+second_pos);
        System.out.println("Third Large Number "+ third+ " at position "+third_pos);

    }
}

public class Rotate_Left {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int r = 2;
        for (int k = 0; k < r; k++) {
            int first = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = first;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}

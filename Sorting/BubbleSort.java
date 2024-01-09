import java.util.Arrays;
class BubbleSort{
    public static void bubble(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            boolean swapped;
            swapped = false;
            for (int j = 1; j <= arr.length-i-1; j++) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) { //to check if the array is finally sorted or not
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        bubble(arr);
    }
}
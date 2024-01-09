import java.util.Arrays;
public class SelectionSortTypeTwo {
    public static void selection(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, last, maxIndex);
        }
    }

    public static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = 1; i <= end ; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    public static void swap (int[] arr, int last, int maxIndex){
        int temp = arr[last];
        arr[last] = arr[maxIndex];
        arr[maxIndex] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {0, -1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}

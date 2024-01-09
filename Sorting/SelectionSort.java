import java.util.Arrays;

public class SelectionSort {
    public static void selection(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                //find the smallest value
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            //swap the values
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {5,1,4,2,3};
        selection(arr);
    }
}

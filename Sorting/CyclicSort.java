import java.util.Arrays;

public class CyclicSort {

    public static void cyclicSort(int[] arr){
        int correctIndex;
        int i=0;
        while(i < arr.length){
            correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
    }

    public static void swap (int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {6,2,3,1,5,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

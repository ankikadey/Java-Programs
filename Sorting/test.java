import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        int[] arr = { 7, 9, 3, 8, 2, 5, 4 };
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        System.out.print(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1); // left part
            quickSort(arr, pivotIndex + 1, high); // right part
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int pi = low - 1; // partition index
        for (int i = low; i < high; i++) {
            if (arr[i] < pivot) {
                swap(arr[i], arr[++pi]);
            }
        }
        swap(arr[high], arr[++pi]);
        return pi;
    }

    public static void swap(int a, int b) {

        int temp = a;
        a = b;
        b = temp;
    }

}

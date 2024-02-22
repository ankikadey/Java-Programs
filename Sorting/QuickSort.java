import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int piv = partition(arr, low, high); // to get the sorted position of the pivot element

            quickSort(arr, low, piv - 1); // for left part
            quickSort(arr, piv + 1, high); // for right part
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // the pivot element
        int pi = low - 1; // counter for smaller value

        for (int j = low; j < high; j++) {
            // compare the values with pivot element
            if (arr[j] < pivot) {
                pi++;
                // swap
                swap(arr, j, pi);
            }
        }
        pi++;
        // swap with pivot
        swap(arr, high, pi);

        return pi;
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { -3, -1, 0, 5, -89, 88 };
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
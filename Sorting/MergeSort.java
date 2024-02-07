import java.util.Arrays;

public class MergeSort {
    // for sorting
    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    // for merging
    public static int[] merge(int[] first, int[] second) {
        int[] finalArray = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                finalArray[k] = first[i]; // store the smallest element
                i++;
            } else {
                finalArray[k] = second[j];
                j++;
            }
            k++;
        }

        // it is possible that the length of two arrays are not same, so copy the extra
        // elements
        while (i < first.length) {
            finalArray[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            finalArray[k] = second[j];
            j++;
            k++;
        }

        return finalArray;
    }

    public static void main(String[] args) {
        int[] arr = { 8,1,2,5,9,6 };
        int[] sortedArr = mergeSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
}

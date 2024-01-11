package Searching;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {14,18,7,19,1,5,6,41};
        int target = 14;
        System.out.println(linearSearch(arr, target));
    }
}

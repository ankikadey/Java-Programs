package Searching;

public class SearchInRange {
    public static int linearSearch(int[] arr, int target, int start, int end){
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {14,18,7,19,1,5,6,41};
        int start = 4;
        int end = 7;
        int target = 41;
        System.out.println(linearSearch(arr, target, start, end));
    }
}

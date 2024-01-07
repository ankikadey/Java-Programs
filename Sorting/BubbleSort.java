package Sorting;
class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n-1; i++) { // outer loop for passes
            for (int j = 1; j < n-i ; j++) { //inner loop for comparisons
                if (arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                } 
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); 
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1}; //worst case
        bubbleSort(arr);
        
    }
}

public class FindMissingValue {

    public static int findMissingValue(int[] a, int N){
        for (int i = 1; i < N; i++) { //outer loop for each element
            int flag = 0; //to indicate if the value is present

            for(int j = 0; j < N-1; j++) { //inner loop to find the element in the array
                if (a[j] == i){
                    flag = 1; //i or the value is present
                    break;
                }
            }

            if(flag == 0){ //if the value is not present
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int N = 5;
        int[] arr = {1, 2, 3, 5}; //3 is missing
        System.out.println("Missing value is: " + findMissingValue(arr, N));
    }
}

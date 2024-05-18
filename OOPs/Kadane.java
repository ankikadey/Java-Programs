import java.util.*;
import java.io.*;
class Kadane{
    public static void main(String[] args) {
        int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Contiguous Sum: " + maxSubArray(a));
    }

    static int maxSubArray(int[] a){
        int size = a.length;
        int curr = Integer.MIN_VALUE; //stores the current value
        int max = 0; //stores the maximum value

        //Loop
        for(int i = 0; i < size; i++){
            curr += a[i];
            if (max < curr) {
                max = curr;
            }
            if (curr < 0) {
                curr = 0;
            }
        }

        return max;
    }
    
}

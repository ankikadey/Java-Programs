import java.util.Arrays;
import java.util.Scanner;
public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for(int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        sc.close();

        // for (int row = 0; row < arr.length; row++){
        //     for (int col = 0; col <arr[row].length; col++){
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;
public class ArraytoString {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);

        // //take inputs
        for(int i =0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //generate output
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //array of objects
        String[] str = new String[3];
        for(int i =0; i < str.length; i++){
            str[i] = sc.next();
        }

        sc.close();

        //generate output
        System.out.println(Arrays.toString(str)); //it is taking a whole array as input so no need of for loop.
    }
    
}

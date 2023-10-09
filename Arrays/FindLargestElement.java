import java.util.*;
public class FindLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println(arr[n-1]);
    }
}

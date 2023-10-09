import java.util.Scanner;
public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] b = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        //to copy the array 'arr' into the new array 'b'
        for (int i = 0; i < n; i++) {
            b[i] = arr[i];
        }

        System.out.println("Elements of array 'arr': ");
        //Syntax of For Each loop
        // for (dataType variableName : arrayName){
        //     System.out.println(variableName);
        // }
        
        for(int a : arr){
            System.out.print(a + " ");
        }

        System.out.println("\nElements of array 'b': ");
        for(int c : b){
            System.out.print(c + " ");
        }
    }
}

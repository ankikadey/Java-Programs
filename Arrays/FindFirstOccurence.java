// Find the first occurence of a key in an array
import java.util.Scanner;

class FindFirstOccurence{
    public static int findFirstOccurence(int[] arr, int n, int key){
        for(int i=0; i<n; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the key to find: ");
        int key = sc.nextInt();

        int index = findFirstOccurence(arr, n, key);

        if(index == -1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key found at index: " + index);
        }

        sc.close();
    }
}

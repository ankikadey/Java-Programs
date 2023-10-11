public class TransposeMatrix1 {
    public static void main(String[] args) {
        int[][] a = {{1,2,3}, {4, 5, 6}};

        System.out.println("Original Matrix: ");
        for (int[] x : a) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose of Matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}

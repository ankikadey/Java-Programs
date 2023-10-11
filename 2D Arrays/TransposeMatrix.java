public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,6}}; //rows=2, col=3
        int[][] t = new int[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                t[i][j] = a[j][i];
            }
        }
        System.out.println("Original Matrix: ");
        for (int[] x : a) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose of the matrix: ");
        for (int[] x : t) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}

/**
 * AddMatrices
 */
public class AddMatrices {

    public static void main(String[] args) {
        int[][] a = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
        int[][] b = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };

        int[][] c = new int[3][3]; // a new matrix to store the sum of the two matrices

        for (int i = 0; i < 3; i++) { // outer loop for rows
            for (int j = 0; j < 3; j++) { // inner loop for columns
                c[i][j] = a[i][j] + b[i][j]; // sum to two matrices
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
public class EqualMatrix {
    public static void main(String[] args) {
        int[][] a = {{1,2}, {3,4}};
        int[][] b = {{1,5}, {3,4}};

        boolean equal = true; //for indication

        //for matrix a
        int row1 = a.length;
        int col1 = a[0].length;

        //for matrix b
        int row2 = b.length;
        int col2 = b[0].length;

        if(row1 != row2 || col1 != col2){
            System.out.println("Matrices are not equal");
        }
        else{
            for(int i = 0; i < row1; i++){
                for(int j = 0; j < col1; j++){
                    if(a[i][j] != b[i][j]){
                        equal = false; //when not equal
                        break;
                    }
                }
            }
            if(equal) //if(true/false)
                System.out.println("Matrices are equal");
            else
                System.out.println("Matrices are not equal");
        }
    }
}

public class ExceptionExample {
    public static void main(String[] args) {
        // // NullPointerException
        // String str = null;
        // try {
        //     System.out.println(str.length());
        // }
        // catch (NullPointerException e) {
        //     e.printStackTrace();
        // }

        // // NumberFormatException
        // String numStr = "123abc";
        // try {
        //     int num = Integer.parseInt(numStr);
        //     System.out.println("Number: " + num);
        // }
        // catch (NumberFormatException e){
        //     e.printStackTrace();
        // }

        // ArrayIndexOutOfBoundsException
        int[] arr = new int[5];
        try {
            System.out.println(arr[10]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}

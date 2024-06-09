public class JavaFinallyBlock {
    public static void main(String[] args) {
        // Case 1: Exception doesn't occur
        // try {
        //     int data = 25 / 5;
        //     System.out.println(data);
        // } catch (NullPointerException e) {
        //     System.out.println(e);
        // } finally {
        //     System.out.println("The finally block is executed");
        // }

        // Case 2: Exception occurs but it is not handled
        // try {
        //     int data = 25 / 0;
        //     System.out.println(data);
        // }
        // catch (NullPointerException e) {
        //     System.out.println(e);
        // }
        // finally {
        //     System.out.println("The finally block is executed");
        // }

        // System.out.println("Rest of the code");

        // Case 3: Exception occurs and it is handled properly
        try {
            int data = 25 / 0;
            System.out.println(data);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("The finally block is executed");
        }

        System.out.println("Rest of the code");
    }
}

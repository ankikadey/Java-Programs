public class NestedTry {
    public static void main(String[] args) {
        try{
            try{
                System.out.println("Going to divide by zero");
                int b = 42 / 0;
            }
            catch(ArithmeticException e){
                e.printStackTrace();
            }
            try{
                System.out.println("Going to access an array out of bounds");
                int[] c = {1};
                c[5] = 10;
            }
            catch(ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
            }

            String str=null;
            System.out.println("Going to print a null string");
            System.out.println(str.toString());
        }
        catch(Exception e){
            System.out.println("Caught an exception in the outer try block");
        }
        System.out.println("The rest of the code runs smoothly");
    }
}

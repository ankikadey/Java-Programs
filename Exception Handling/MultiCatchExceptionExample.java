public class MultiCatchExceptionExample {
    public static void main(String[] args) {
        try{
            int a[] = new int[5];
            a[5] = 30/0;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
        catch(ArithmeticException e){
            System.out.println(e.toString());
        }
        catch(Exception e){
            System.out.println("Parent Exception Occurs");
        }
    }
}

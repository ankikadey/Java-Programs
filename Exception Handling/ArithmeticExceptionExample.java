public class ArithmeticExceptionExample{
    public static void main(String[] args) {
        int a = 0;
        int b = 5;
        try{
            int c = b / a;
            System.out.println("The result is: " + c);
        }
        catch(ArithmeticException e){
            // e.printStackTrace(); //it is used the get the description or details of the exception
            // System.out.println(e.toString()); //to print in the format--> Name of the exception : description of the exception
            System.out.println(e.getMessage()); //it prints only the description of the exception
        }
        //rest of the code
        System.out.println("I successfully executed the code");
    }
}
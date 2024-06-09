class UserDefinedException extends Exception{
    public UserDefinedException(String str){
        super(str);
    }
}

public class UserDefinedExceptionExample{
    public static void main(String[] args) {
        try {
            throw new UserDefinedException("This is a user defined exception");
        } catch (UserDefinedException ude) {
            // TODO: handle exception
            System.out.println("Caught the exception");
            System.out.println(ude.getMessage());
        }
    }
}
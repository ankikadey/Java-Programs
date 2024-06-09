import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JavaThrowExample {
    // Unchecked Exception
    public static void validAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("This Person is not eligible to vote");
        }
        else{
            System.out.println("This Person is eligible to vote");
        }
    }

    // Checked Exception
    // public static void method() throws FileNotFoundException {
    //     FileReader file = new FileReader(d:\\OneDrive\\Coding\\Github\\Java-Programs\\abc.txt);
    //     BufferedReader fileInput = new BufferedReader(file);
    //     throw new FileNotFoundException();
    // }

    public static void main(String[] args) {
        validAge(19);
        // try {
        //     method();
        // } catch (FileNotFoundException e) {
        //     // TODO: handle exception
        //     e.printStackTrace();
        // }
    }
}

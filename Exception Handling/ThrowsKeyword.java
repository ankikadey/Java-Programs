import java.io.IOException;

class TestThrows{
    public static void method() throws IOException{
        throw new IOException("Device error is resolved");
    }
}

public class ThrowsKeyword {
    public static void main(String[] args) throws IOException{ //declare exception
        // try {
        //     TestThrows tt = new TestThrows();
        //     tt.method();
        // }
        // catch (Exception e) {
        //     System.out.println("Caught the exception");
        // }

        TestThrows tt = new TestThrows();
        tt.method();

        System.out.println("Rest of the code");
    }
}

public class StringConcat {
    public static void main(String[] args) {
        //using concat() method
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1.concat(s2); //HelloWorld

        //using + operator
        String s4 = 30+50+"Hi"+50+30; //after string literal all the '+' will be considered as string concatenation operator
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}

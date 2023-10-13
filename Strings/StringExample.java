public class StringExample{
    public static void main(String[] args) {
        String s1 = "Hello"; //using java string literal
        char[] ch = {'W', 'o', 'r', 'l', 'd'};
        String s2 = new String(ch); //converting char array to string
        String s3 = new String("!"); //creating java string by new keyword
        System.out.print(s1);
        System.out.print(s2);
        System.out.print(s3);
    }
}
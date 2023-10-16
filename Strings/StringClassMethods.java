public class StringClassMethods {
    public static void main(String[] args) {
        String fname = "Tony";
        String lname = "Stark";
        String fullname = fname + " " + lname;
        System.out.println(fullname);

        //length of the fullname
        System.out.println(fullname.length());

        //index of a character
        System.out.println(fullname.charAt(7));

        //convert an interger into String
        int a = 123;
        String s = String.valueOf(a);
        System.out.println(s + 123);

        //convert a String into integer
        String s1 = "123";
        int b = Integer.parseInt(s1);
        System.out.println(b + 123);
    }
}

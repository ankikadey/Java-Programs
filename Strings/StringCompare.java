public class StringCompare {
    public static void main(String[] args) {
        // by using equals() & equalsIgnoreCase()
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("hello");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false
        System.out.println(s1.equalsIgnoreCase(s3)); // true
        System.out.println(s2.equalsIgnoreCase(s3)); // false

        // by using == operator
        String s4 = "Hello";
        String s5 = "Hello";
        String s6 = new String("Hello");
        System.out.println(s4 == s5); //true --> they both are pointing to the same innstance
        System.out.println(s5 == s6); //false --> s6 refers to the object created in the non-pool area

        //by using compareTo() method
        String s7 = "Hello";
        String s8 = "Hello";
        String s9 = "Mello";
        String s10 = "hello";
        System.out.println(s7.compareTo(s9)); // -ve value (-5)
        System.out.println(s7.compareTo(s8)); //0
        System.out.println(s10.compareTo(s7)); // +ve value (32)
    }
}

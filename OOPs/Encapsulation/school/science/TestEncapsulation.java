package school.science;

public class TestEncapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Anushka");
        s1.setNumber(1234567890);

        System.out.println(s1.getName());
        System.out.println(s1.getNumber());
    }

}

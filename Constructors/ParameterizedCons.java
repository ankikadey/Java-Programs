package Constructors;
//Using parameterized constructor, store the data about students --> fname, lname, roll, standard
class MyClass {
    String fname;
    String lname;
    int roll;
    int standard;
    MyClass(String fname, String lname, int roll, int standard){
        this.fname = fname;
        this.lname = lname;
        this.roll = roll;
        this.standard = standard;
    }

    void display(){
        System.out.println("Name: " + fname + " " + lname);
        System.out.println("Roll: " + roll);
        System.out.println("Standard: " + standard);
    }

    public static void main(String[] args) {
        MyClass s1 = new MyClass("Arun", "Shaw", 1, 10);
        MyClass s2 = new MyClass("Rahul", "Sharma", 60, 11);
        s1.display();
        s2.display();
    }
}

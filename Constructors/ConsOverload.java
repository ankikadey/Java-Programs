package Constructors;

class Demo {
    int id;
    int age;
    String name;

    Demo(int id, int age, String name){
        this.id = id;
        this.age = age;
        this.name = name;
    } //constructor with 3 parameters

    Demo(int id, int age){
        this.id = id;
        this.age = age;
    } //constructor with 2 parameters

    public static void main(String[] args) {
        Demo d1 = new Demo(1, 20, "Arun");
        Demo d2 = new Demo(2, 21);
        System.out.println("Name: " + d1.name + "\nAge: " + d1.age + "\nID: " + d1.id);
        System.out.println("Name: " + d2.name + "\nAge: " + d2.age + "\nID: " + d2.id);
    }
}

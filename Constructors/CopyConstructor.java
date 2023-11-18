package Constructors;

 class Student {
    int id;
    String name;

    //to initialize the integer and string
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    //to initialize another object
    Student(Student s){
       id = s.id;
       name = s.name; 
    }

    void display(){
        System.out.println("ID: " + id + "\nName: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Arun");
        Student s2 = new Student(s1);
        s1.display();
        s2.display();
    }
}

package Constructors;

class DemoStudent {
    int id;
    String name;

    //to initialize the integer and string
    DemoStudent(int id, String name){
        this.id = id;
        this.name = name;
    }

    DemoStudent(){}

    void display(){
        System.out.println("ID: " + id + "\nName: " + name);
    }

    public static void main(String[] args) {
        DemoStudent s1 = new DemoStudent(12, "Karan");
        DemoStudent s2 = new DemoStudent();
        s2.id = s1.id;
        s2.name = s1.name;
        s1.display();
        s2.display();
    }
}

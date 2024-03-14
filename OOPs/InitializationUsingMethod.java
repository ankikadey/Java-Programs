class Student {
    int roll;
    String name;
    void insertRecord(int r, String n){
        roll = r;
        name = n;
    }
    void displayInformation(){
        System.out.println(roll + " " + name);
    }
}

class Test{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.insertRecord(6, "Ankika");
        s1.displayInformation();
    }
}

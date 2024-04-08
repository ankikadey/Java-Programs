class Student{
    private int roll;
    private String name;

    //accessor method or getter
    public int getRoll(){
        return roll;
    }

    //mutator method or setter
    public void setRoll(int roll){
        this.roll = roll;
    }

    //getter --> get the Name
    public String getName(){
        return name;
    }

    //setter --> change the Name
    public void setName(String name){
        this.name = name;
    }

    public void display(){
        System.out.println(roll + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.setName("Ankita Deshpande");
        s1.setRoll(6);

        s2.setName("Minerva");
        s2.setRoll(5);
        System.out.println(s2.getName());

        System.out.println(s1.getName() + " " + s1.getRoll());

    }
}
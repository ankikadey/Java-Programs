package Inheritance;

class Employee { //Super Class
    double salary = 50000;
}

class Developer extends Employee{ //child class
    int bonus = 20000;

    public static void main(String[] args) {
        Developer d1 = new Developer();
        System.out.println(d1.salary + " " + d1.bonus);
    }

}

class Truck {
    // class attributes --> State
    String color = " White";
    int max_speed = 200;
    int fuel_capacity = 50;

    // class methods --> Behaviour
    void drive() {
        System.out.println("Driving...");
    }

    // Constructor no-arguement
    Truck(){
        System.out.println("Constructor called!");
    }

    public static void main(String[] args) {
        Truck mahindra = new Truck(); // this is the non-parameterized constructor
        System.out.println(mahindra.color);
        System.out.println(mahindra.max_speed);
        mahindra.drive();
    }
}

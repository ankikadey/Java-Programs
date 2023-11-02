class Car {
    // class attributes --> state
    String color = "White";
    int max_speed = 200;
    int fuel_capacity = 50;


    // class methods --> behaviour
    void drive() {
        System.out.println("Driving...");
    }

    void stop() {
        System.out.println("Applying the brake...");
    }

}

class Main{
    public static void main(String[] args) {
        Car audi = new Car(); // this is the default constructor
        System.out.println(audi.color);
        System.out.println(audi.max_speed);
        audi.stop();
    }
}

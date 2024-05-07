package Abstraction;

/* Vehicle Rental System:
Design a vehicle rental system where you have different types of vehicles like Car, Bike, and Truck.
Each vehicle type should have specific attributes like model, make, rental rate, etc.
Implement a method to calculate the rental cost based on the type and duration of rental. */

abstract class Vehicle {
    String make;
    String model;
    double rentalRate;

    abstract double calculateRental(int days);
}

class Car extends Vehicle {
    Car(String make, String model, double rentalRate) {
        this.make = make;
        this.model = model;
        this.rentalRate = rentalRate;
    }

    @Override
    double calculateRental(int days) {
        return rentalRate * days;
    }
}

class Bike extends Vehicle {
    Bike(String make, String model, double rentalRate) {
        this.make = make;
        this.model = model;
        this.rentalRate = rentalRate;
    }

    @Override
    double calculateRental(int days) {
        return rentalRate * days;
    }
}

class Truck extends Vehicle {
    Truck(String make, String model, double rentalRate) {
        this.make = make;
        this.model = model;
        this.rentalRate = rentalRate;
    }

    @Override
    double calculateRental(int days) {
        return rentalRate * days * 1.5;
    }
}

public class RentalSystem{
    public static void main(String[] args) {
        Vehicle v1 = new Car("Honda", "HND10258", 1000);
        System.out.println(v1.calculateRental(8));

        v1 = new Truck("Ford", "FRD56464", 2000);
        System.out.println(v1.calculateRental(5));
    }
}
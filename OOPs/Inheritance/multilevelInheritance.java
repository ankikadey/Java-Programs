package Inheritance;

class Animal{
    public void eat(){
        System.out.println("It eats.");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("It barks.");
    }
}

class Beagle extends Dog{
    public void sleep(){
        System.out.println("It sleeps.");
    }
}

class TestInheritance{
    public static void main(String[] args) {
        Beagle b1 = new Beagle();
        b1.eat(); //from Animal
        b1.bark(); //from Dog
        b1.sleep(); //from Beagle
    }
}
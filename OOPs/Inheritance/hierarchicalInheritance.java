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

class Cat extends Animal{
    public void meow(){
        System.out.println("It meows.");
    }
}

class TestInheritance2{
    public static void main(String[] args) {
        Cat persian = new Cat();
        persian.eat(); //from Animal
        persian.meow(); //from Cat
    }
}
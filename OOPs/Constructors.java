class Animal {
    String breed;
    int age;

    //default / non-parameterized constructor
    Animal(){
        System.out.println("This is a default constructor.");
    }

    //parameterized constructor
    Animal(String breed, int age){
        this.breed = breed;
        this.age = age;
    }

    public static void main(String[] args) {
        Animal dog = new Animal();
        Animal cat = new Animal("Persian", 1);
        dog.breed = "Labrador";
        dog.age = 3;

        System.out.println(dog.breed + " " + dog.age);
        System.out.println(cat.breed + " " + cat.age);
    }
}

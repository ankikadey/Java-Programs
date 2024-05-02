class Address{
    String city, state, country;
    int zipcode;

    public Address(String city, String state, int zipcode, String country){
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;
    }
}

class Employee{
    int id;
    String name;
    Address address; //here Address is the class --> aggregation

    public Employee(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display(){
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.zipcode + " " + address.country);
    }
}

class Aggregation{
    public static void main(String[] args) {
        Address add1 = new Address("Kolkata", "West Bengal", 700107, "India");
        Address add2 = new Address("Mumbai", "Maharashtra", 956701, "India");

        Employee emp1 = new Employee(101, "Ashrit", add1);
        Employee emp2 = new Employee(102, "Vanshika", add2);

        emp1.display();
        emp2.display();
    }
}
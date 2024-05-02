class Bank {
    float getRateOfInterest(){return 0;}
}

class SBI extends Bank{
    float getRateOfInterest(){
        return 8.3f;
    }
}

class Axis extends Bank{
    float getRateOfInterest(){
        return 9.4f;
    }
}

class ICICI extends Bank{
    float getRateOfInterest(){
        return 10.3f;
    }
}

class TestPolymorphism{
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println(b.getRateOfInterest());
        b = new ICICI();
        System.out.println(b.getRateOfInterest());
    }
}


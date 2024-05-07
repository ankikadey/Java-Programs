package Abstraction;

abstract class Bank{
    abstract int getROI();
} //Abstract class

class SBI extends Bank{
    int getROI(){
        return 8;
    }
}
class Axis extends Bank{
    int getROI(){
        return 7;
    }
}
class ICICI extends Bank{
    int getROI(){
        return 6;
    }
}

class TestAbstraction{
    public static void main(String[] args) {
        Bank bank;
        bank = new SBI();
        System.out.println(bank.getROI());
        bank = new Axis();
        System.out.println(bank.getROI());
    }
}
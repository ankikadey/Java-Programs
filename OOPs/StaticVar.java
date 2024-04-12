class Counter {
    //without static keyword
    // int counter = 0; //will get memory each time an object is created

    //with static keyword
    static int counter = 0; //memory is allocated only once.

    static void change(){ //static method
        counter = 5;
    }

    Counter(){
        counter++;
        System.out.println(counter);
    }
    public static void main(String[] args) {
        Counter.change();
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        Counter c5 = new Counter();


        
    }
}
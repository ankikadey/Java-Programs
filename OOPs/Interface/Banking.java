package Interface;
/**
 * Bank
 */
interface Bank {
    float getROI();
}

class SBI implements Bank{
    @Override
    public float getROI(){
        return 9.5f;
    }
}
class ICICI implements Bank{
    @Override
    public float getROI(){
        return 9.5f;
    }
}
class Axis implements Bank{
    @Override
    public float getROI(){
        return 9.5f;
    }
}

public class Banking{
    public static void main(String[] args){
        Bank b;
        b = new SBI();
        System.out.println(b.getROI());
    }
}

package Interface;

interface Drawable {
    void draw();
}

interface Showable{
    void show();
}

class Child implements Drawable, Showable{
    @Override
    public void draw(){
        System.out.println("Hello");
    }
    @Override
    public void show(){
        System.out.println("Welcome");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.draw();
        c1.show();
    }
}

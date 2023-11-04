class Box {
    float height;
    float length;
    float breadth;

    //constructor definition
    Box(float height, float length, float breadth) {
        this.height = height;
        this.length = length;
        this.breadth = breadth;
    }

    public static void main(String[] args) {
        Box b1 = new Box(10, 20, 10);
        Box b2 = new Box(20, 30, 20);
        System.out.println("Box 1: " + b1.height + " " + b1.length + " " + b1.breadth);
        System.out.println("Box 2: " + b2.height + " " + b2.length + " " + b2.breadth);
    }
}

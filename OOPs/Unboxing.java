public class Unboxing {
    public static void main(String[] args) {
        Integer i = new Integer("10"));
        int j = i; //unboxing
        System.out.println("Value of i: " + i);
        System.out.println("Value of j: " + j);

        Double d = new Double("56.65");
        double e = d; //unboxing
        System.out.println("Value of d: " + d);
        System.out.println("Value of e: " + e);
    }
}

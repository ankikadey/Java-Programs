package DataTypes;
public class Sum {

    public static void sum(int a, int b) {
        int sum;
        sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
    }

    public static void main(String[] args) {
        int a = 10, b = 15;
        sum(a, b);
    }
}

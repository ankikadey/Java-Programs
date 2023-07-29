package Operators;
public class IncrementOperator {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x++); // 10 -> 11 postfix --> 10
        System.out.println(++x); //11 -> 12 prefix --> 12
        System.out.println(x--); //12 -> 11 postfix --> 12
        System.out.println(--x); //11 -> 10 prefix --> 10
    }
}

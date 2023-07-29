package Operators;
import java.util.Scanner;

public class OperatorExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter two numbers:");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        // Arithmetic operators
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        double remainder = num1 % num2;

        // Displaying arithmetic results
        System.out.println("Arithmetic Operations:");
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + difference);
        System.out.println(num1 + " * " + num2 + " = " + product);
        System.out.println(num1 + " / " + num2 + " = " + quotient);
        System.out.println(num1 + " % " + num2 + " = " + remainder);

        // Assignment operators
        num1 += num2;
        num1 -= num2;
        num1 *= num2;
        num1 /= num2;
        num1 %= num2;

        // Displaying assignment results
        System.out.println("\nAssignment Operations:");
        System.out.println("num1 += num2: " + num1);
        System.out.println("num1 -= num2: " + num1);
        System.out.println("num1 *= num2: " + num1);
        System.out.println("num1 /= num2: " + num1);
        System.out.println("num1 %= num2: " + num1);

        // Increment and Decrement operators (postfix)
        num1++;
        num2--;
        System.out.println("\nIncrement/Decrement Operations(postfix):");
        System.out.println("num1++: " + num1);
        System.out.println("num2--: " + num2);
        
        // Increment and Decrement operators (prefix)
        ++num1;
        --num2;
        System.out.println("\nIncrement/Decrement Operations(prefix):");
        System.out.println("++num1: " + num1);
        System.out.println("--num2: " + num2);

        // Relational operators
        boolean isEqual = num1 == num2;
        boolean isNotEqual = num1 != num2;
        boolean isGreater = num1 > num2;
        boolean isLess = num1 < num2;
        boolean isGreaterOrEqual = num1 >= num2;
        boolean isLessOrEqual = num1 <= num2;
        System.out.println("\nRelational Operations:");
        System.out.println(num1 + " == " + num2 + " is " + isEqual);
        System.out.println(num1 + " != " + num2 + " is " + isNotEqual);
        System.out.println(num1 + " > " + num2 + " is " + isGreater);
        System.out.println(num1 + " < " + num2 + " is " + isLess);
        System.out.println(num1 + " >= " + num2 + " is " + isGreaterOrEqual);
        System.out.println(num1 + " <= " + num2 + " is " + isLessOrEqual);

        // Logical operators
        boolean logicalAnd = (num1 > 0) && (num2 < 10);
        boolean logicalOr = (num1 > 0) || (num2 < 10);
        boolean logicalNot = !(num1 > 0);
        System.out.println("\nLogical Operations:");
        System.out.println("(num1 > 0) && (num2 < 10) is " + logicalAnd);
        System.out.println("(num1 > 0) || (num2 < 10) is " + logicalOr);
        System.out.println("!(num1 > 0) is " + logicalNot);

        sc.close();
    }
}

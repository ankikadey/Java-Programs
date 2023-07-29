package Operators;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide the first number");
        int a = sc.nextInt();

        System.out.println("Please provide the second number");
        int b = sc.nextInt();

        do {
            System.out.println("Please choose from the following operations:  \n 1. + \n 2. - \n 3. * \n 4. / \n 5. % \n 6. Exit");
            int c = sc.nextInt();

            switch (c) {

                case 1:
                    System.out.println("The sum is " + (a + b));
                    break;

                case 2:
                    System.out.println("The difference is " + (a - b));
                    break;

                case 3:
                    System.out.println("The product is " + (a * b));
                    break;

                case 4:
                    System.out.println("The quotient is " + (a / b));
                    break;

                case 5:
                    System.out.println("The remainder is " + (a % b));
                    break;

                case 6:
                    sc.close(); // Close the Scanner before exiting the program
                    return;

                default:
                    System.out.println("Invalid input");
            }
        } while (true);
    }
}

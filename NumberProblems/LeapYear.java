package NumberProblems;
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a year:");
        int year = sc.nextInt();

        boolean isLeapYear = false;

        // Check if the year is divisible by 4
        if (year % 4 == 0) {
            // Check if it is a century (ends with 00)
            if (year % 100 == 0) {
                // Check if it is divisible by 400
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                // If it is not a century, then it's a leap year
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        sc.close();
    }
}

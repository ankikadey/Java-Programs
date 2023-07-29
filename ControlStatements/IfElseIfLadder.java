package ControlStatements;
public class IfElseIfLadder {
    public static void main(String[] args) {
        //a code to demonstrate grades using if-else-if ladder
        //grades are fail, D, C, B, A, A+
        int m = 100;

        //the if-else-if ladder
        if(m<50)
            System.out.println("Fail");
        else if(m>=50 && m<60)
            System.out.println("Your grade is D");
        else if(m>=60 && m<70)
            System.out.println("Your grade is C");
        else if(m>=70 && m<80)
            System.out.println("Your grade is B");
        else if(m>=80 && m<90)
            System.out.println("Your grade is A");
        else if(m>=90 && m<=100)
            System.out.println("Your grade is A+");
        else
            System.out.println("Invalid");
    }
}

package ControlStatements;
public class NestedIf {
    public static void main(String[] args) {
        //a code to check if a person is eligible to donate blood or not
        int age = 45;
        int weight = 58;
        //applying condition to check
        if(age >= 18){
            if(weight > 50){
                System.out.println("You can donate blood");
            }
            else {
                System.out.println("You cannot donate blood because of weight");
            }
            //the if block for checking weight ended here
        }
        else{
            System.out.println("You cannot donate blood because of your age");
        }
    }
}

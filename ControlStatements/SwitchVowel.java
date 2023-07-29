package ControlStatements;
import java.util.Scanner;
public class SwitchVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice = sc.next().charAt(0);
        switch (choice){
            case 'a' :
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(choice + " is a Vowel");
                break;
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(choice + " is a Vowel");
                break;
            default:
                if (Character.isLetter(choice)) {
                    System.out.println(choice + " is a consonant.");
                } else {
                    System.out.println("Invalid input. Please enter a letter.");
                }
                break;
        }
        sc.close();
    }
}

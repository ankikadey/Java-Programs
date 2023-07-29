package DataTypes;

public class EscapeChar {

    public static void main(String[] args) {
        // \n --> Newline
        System.out.println("Hello\nWorld!");

        // \t --> Tab
        System.out.println("Java\tProgramming");

        // \\ --> Backslash
        System.out.println("This is a backslash: \\");

        // \' --> Single quote
        System.out.println("Don't \'worry\' about apostrophes!");

        // \" --> Double quote
        System.out.println("She said, \"Hello!\"");

        // \r --> Carriage return and \b --> backspace
        System.out.println("12345\r"); // The carriage return moves the cursor to the beginning of the line
        System.out.println("XYZ\b");   // The backspace removes the last character (Z in this case)

        // Unicode character 
        System.out.println("\u00A9 All rights reserved.");
    }
}

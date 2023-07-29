package DataTypes;
//code to show the differnce between the primitive and non-primitive datatypes

import java.util.Arrays;

public class Prim_Non_Prim {
    public static void main(String[] args) {
        System.out.println("Primitive Data Types: ");
        int x = 10;
        int y = x; //value of x copied to y
        System.out.println("Initially value of x : "+x+" and value of y: "+y);

        //value of y is changed
        y = 30;
        System.out.println("After changing the value of y: ");
        System.out.println("Value of x is : "+x+" and value of y is: "+y);

        System.out.println("\nNon Primitive Datatypes: ");
        int a[] = {20, 30};
        //the complete reference of c is copied to d
        //they both are pointing to the same memory
        int b[] = a;
        
        System.out.println("Initially the array is a: "+ Arrays.toString(a));
        System.out.println("Initially the array is b: "+ Arrays.toString(b));

        //the value at index 1 is changed to 50 in array d
        b[0] = 40;

        System.out.println("After change the array a is: "+ Arrays.toString(a));
        System.out.println("After change the array b is: "+ Arrays.toString(b));
        

    }
}

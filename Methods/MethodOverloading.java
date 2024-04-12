package Methods;

public class MethodOverloading {
    //by changing the no. of arguements
    static int add (int a, int b){
        return a*b;
    }

    static int add (int a, int b, int c){
        return a*b*c;
    }

    //by changing the datatype
    static int sum (int a, int b){
        return a+b;
    }

    static double sum (double a, double b){
        return a+b;
    }
}

package DataTypes;
public class TypeCasting {
    public static void main(String[] args) {
        //Widening casting
        int myInt = 9;    
        double myDouble = myInt; //automatic casting: int to double
        System.out.println(myInt);
        System.out.println(myDouble);

        //Narrowing Casting
        double my_double = 10.56;
        int my_int = (int) my_double; //narrowing or manual casting : double to int
        System.out.println(my_double);
        System.out.println(my_int);

    }
}

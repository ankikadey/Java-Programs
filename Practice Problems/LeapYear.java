public class LeapYear {
    public static void isLeapYear(int year){
        boolean is_leap = false;
        if (year % 4 ==0){
            is_leap = true; //non-century

            if (year % 100 == 0){
                if (year % 400 == 0){
                    is_leap = true;
                }
                else is_leap = false;
            }
        }
        else {
            is_leap = false;
        }

        if (is_leap){
            System.out.println("The year is a leap year!");
        }
        else {
            System.out.println("The year is not a leap year");
        }
    }
    public static void main(String[] args) {
        isLeapYear(2024);
    }
}

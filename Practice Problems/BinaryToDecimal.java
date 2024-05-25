public class BinaryToDecimal {
    public static void binToDec(int bin){
        int j = 1; //multiplier
        int dec = 0; //to store decimal number
        int rem; //for remainder

        while (bin != 0){
            rem = bin % 10;
            dec += rem * j;
            j *= 2;
            bin /= 10;
        }

        System.out.println(dec);
    }

    public static void main(String[] args) {
        int bin = 1000001;
        binToDec(bin);
    }
}

class BinaryToOctal{
    // 1. Convert the binary number to decimal
    // 2. Convert the decimal number to octal using toOctalString() method, which returns the octal string
    // 3. Convert the octal string into integer.

    public int binToDec(int num){
        int decimalNumber = 0, i = 0;
        while (num > 0){
            decimalNumber += Math.pow(2, i++) * (num % 10);
            num /= 10;
        }
        return decimalNumber;
    }

//    // decimal to octal conversion
//    public int decToOctal(int num){
//        int decimalNumber = binToDec(num);
//        //decimal to octal
//        String octalStr = Integer.toOctalString(decimalNumber);
//
//        int octal = Integer.parseInt(octalStr); //parseInt() takes string as argument and return its integer form
//
//        return octal;
//    }

    public int decimalToOctal(int num){
        int decimalNumber = binToDec(num);
        int octalNumber = 0, i = 0;
        while (decimalNumber != 0){
            //you have to extract the remainder by using %8 and multiply it with increasing power of 10
            octalNumber += (decimalNumber % 8) * ((int)Math.pow(10,i++));
            decimalNumber /= 8;
        }
        return octalNumber;
    }

    public static void main(String[] args) {
        BinaryToOctal bin = new BinaryToOctal();
        System.out.println("Octal Number is: " + bin.decimalToOctal(01101));
    }
}
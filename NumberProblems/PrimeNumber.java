package NumberProblems;
public class PrimeNumber {
    public static void main(String[] args) {
        int n;
        n = 9;
        boolean flag = true; // the number is prime
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                flag = false; // the number is not prime
                break;
            }
        }
        if (flag == true) {
            System.out.println("Prime");
        } else {
            System.out.println("Not a Prime Number!");
        }
    }
}

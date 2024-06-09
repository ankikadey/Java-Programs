public class AutomorphicNumber {
    static boolean isAutomorphic(int num){
        int sq = num*num;
        while(num > 0){
            if (num % 10 != sq % 10)
                return false;
            num /= 10;
            sq /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAutomorphic(76));
    }
}

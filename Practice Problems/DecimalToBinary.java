public class DecimalToBinary {
    public static void decToBin(int n){
        int[] binArr = new int[100];
        int i = 0;
        while (n>0){
            binArr[i] = n % 2;
            n /= 2;
            i++;
        }
        for (int j = i-1; j >= 0 ; j--) {
            System.out.print(binArr[j]);
        }
    }

    public static void main(String[] args) {
        int num = 9;
        decToBin(num);
    }
}

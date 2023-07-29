package NumberProblems;
class SumofNaturalNumbers {
    public static void main(String[] args) {
        int terms = 10;
        int sum = 0;

        for (int i = 1; i <= terms; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

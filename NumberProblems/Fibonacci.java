package NumberProblems;
class Fibonacci{
    public static void main(String[] args){
        int n1 = 0;
        int n2 = 1;
        int n3;
        int terms = 10;

        //the first two terms of Fibonacci series are 0 & 1
        System.out.print(n1 + " " + n2);

        //loop to generate the next terms
        for (int i = 2; i < terms; i++){
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}

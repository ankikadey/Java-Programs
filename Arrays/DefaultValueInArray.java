public class DefaultValueInArray {
    public static void main(String[] args) {
        int[] arr = new int[5]; //memory allocation
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " " );
        }
        System.out.println();
        String[] str = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print(str[i] + " ");
        }
        System.out.println();
        char[] ch = new char[5];
        for (int i = 0; i < 5; i++) {
            System.out.print(ch[i] + " ");  //"\u00000" --> Null
        }
    }
}

package Searching;

public class SearchInString {
    public static int searchInString(String str, char target){
        if(str.length() == 0){
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        String str = "Hello";
        char target = 'o';
        System.out.println(searchInString(str, target));
    }
}

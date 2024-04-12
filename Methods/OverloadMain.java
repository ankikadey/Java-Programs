package Methods;

public class OverloadMain {
    public static void main(String[] args) {
        System.out.println("this is main with String[].");
    }
    public static void main(String args){
        System.out.println("this is main without String.");
    }
    public static void main(){
        System.out.println("this is main without args.");
    }
}

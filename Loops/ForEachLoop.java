package Loops;
class ForEachLoop{
    public static void main(String[] args){
        int[] number = {3, 6, 9, 5, -15};

        //for-each Loop
        for(int elements : number){
            System.out.println(elements);
        }

        //for loop
        for(int i = 0; i < number.length; i++){
            System.out.println(number[i]);
        }
    }
}

package NumberProblems;
class NumberSeries{
    public static void main (String[] args){
        float sum = 0;
        float counter;
        for(counter = 1; counter <= 9; counter +=1){
            sum += counter/(counter+1);
        }
        System.out.println(sum);
    }
}

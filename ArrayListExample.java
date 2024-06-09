import java.util.*; 
public class ArrayListExample{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        System.out.println(list);
        list.add(1, "Grapes");
        System.out.println(list);

        //use of Iterator
        Iterator<String> itr = list.iterator(); //getting the iterator
        while(itr.hasNext()){ //check if the itertor has the elements
            System.out.println(itr.next()); //printing the element and move onto the next
        }
    }
}
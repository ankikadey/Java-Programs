import java.util.*;
public class HashSetExample{
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet();
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Orange");
        hs.add("Banana");
        hs.add("Orange");
        hs.add("Grapes");
        hs.remove("Orange");
        Iterator<String> it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
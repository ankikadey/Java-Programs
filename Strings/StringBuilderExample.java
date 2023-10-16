public class StringBuilderExample {
    public static void main(String[] args) {
        //use of append(string s)
        StringBuilder fname = new StringBuilder("Tony ");
        fname.append("Stark"); //original string is changed
        System.out.println(fname);

        //use of charAt(int index)
        System.out.println(fname.charAt(7));

        //use of insert(int offset, string s)
        System.out.println(fname.insert(4, " Jane"));

        //use of delete(int start, int end)
        System.out.println(fname.delete(4, 9));

        //use of replace(int start, int end, string s)
        System.out.println(fname.replace(4, 10, " Jane"));

        //use of reverse()
        System.out.println(fname.reverse());

        //use of capacity()
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity()); //by default capacity is 16
        sb.append(fname.reverse());
        System.out.println(sb.capacity()); //now capacity is 16
        sb.append(". He is one of the famous person in the hollywood industry.");
        System.out.println(sb);
        System.out.println(sb.capacity()); //now capacity is (16*2*2)+2+2=68 i.e. (oldcapacity*2*2)+2+2

        //use of ensureCapacity(int minCapacity)
        sb.ensureCapacity(100); //current capacity 68
        System.out.println(sb.capacity()); //now capacity is (68*2)+2 = 168
    }

}

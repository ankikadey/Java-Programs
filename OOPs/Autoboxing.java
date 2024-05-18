public class Autoboxing{

    public static void modify(Integer i){
        i = i + 1;
        System.out.println("Modified value: " + i);
    }
    public static void main(String[] args) {
        byte by = 30;
        short s = 20;
        int i = 5;
        long l = 10;
        float f = 5.6f;
        double d = 5.6;
        char c= 'a';
        boolean b = true;

        //Autoboxing
        Byte byteobj = by;
        //Byte byteobj = Byte.valueOf(by);
        Short shortobj = s;
        //Short shortobj = Short.valueOf(s);
        Integer intobj = i;
        //Integer intobj = Integer.valueOf(i);
        Long longobj = l;
        //Long longobj = Long.valueOf(l);
        Float floatobj = f;
        //Float floatobj = Float.valueOf(f);
        Double doubleobj = d;
        //Double doubleobj = Double.valueOf(d);
        Character charobj = c;
        //Character charobj = Character.valueOf(c);
        Boolean boolobj = b;
        //Boolean boolobj = Boolean.valueOf(b);

        System.out.println("Values of Autoboxed objects (printing as objects)");
        System.out.println("Byte object byteobj:  " + byteobj);
        System.out.println("Short object shortobj:  " + shortobj);
        System.out.println("Integer object intobj:  " + intobj);
        System.out.println("Long object longobj:  " + longobj);
        System.out.println("Float object floatobj:  " + floatobj);
        System.out.println("Double object doubleobj:  " + doubleobj);
        System.out.println("Character object charobj:  " + charobj);
        System.out.println("Boolean object boolobj:  " + boolobj);

        modify(intobj);
        System.out.println("Original value: " + intobj);

    }
}
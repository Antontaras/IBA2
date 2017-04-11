/*
 Show that hex and octal notations work with long values.
 Use Long.toBinaryString( ) to display the results.
 */
public class Exersice8 {

    public static void main(String ... args){
        long l1 = 0x4f;     //hex
        System.out.println("l1 " + Long.toBinaryString(l1));

        long l2 = 0255; //octail
        System.out.println("l2 " + Long.toBinaryString(l2));

    }
}

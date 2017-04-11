/*
Write a method that takes two String arguments and uses all the boolean comparisons to compare the two Strings and print the results.
 For the == and !=, also perform the equals( ) test. In main( ), call your method with some different String objects.
 */
public class Exercise14 {

    public static void main(String ... args){
        String first = "Hello";
        String second = "World";
        comperatorMetod(first, second);
    }

    public static void comperatorMetod(String a, String b){

        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a != b);
        System.out.println(!a.equals(b));

    }
}

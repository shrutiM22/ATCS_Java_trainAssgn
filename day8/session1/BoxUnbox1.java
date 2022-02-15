/**
 * BoxUnbox1
 */
public class BoxUnbox1 {

    public static void main(String[] args) {
        
        Integer i = new Integer(9);

        //unboxing the object
        int n = i;

        System.out.println(i);
        System.out.println(n);

        //autoboxing of char
        Character c = 'c';

        //auto-unboxing of char
        char ch = c;

        System.out.println(c);
        System.out.println(ch);
    }
}





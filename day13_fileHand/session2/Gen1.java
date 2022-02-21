import java.util.ArrayList;
import java.util.Iterator;

/**
 * Gen1
 */
public class Gen1 {

    public static void main(String[] args) {
        
        ArrayList a = new ArrayList();
        a.add("i");
        a.add("love");
        a.add("ice creams");
        System.out.println(a);
        Iterator i = a.iterator();
        while(i.hasNext())
            System.out.print(i.next() + " ");
    }
}
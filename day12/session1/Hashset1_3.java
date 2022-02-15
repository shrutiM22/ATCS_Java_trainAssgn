import java.util.HashSet;
import java.util.Iterator;

/**
 * Hashset1
 */
public class Hashset1_3 {

    public static void main(String[] args) {
        
        HashSet h = new HashSet<>();

        for(int i=1;i<=10;i++)
            h.add(i);
        
        h.add("they");
        h.add("are");
        h.add('s');
        System.out.println(h);

        Iterator i = h.iterator();
        while(i.hasNext())
            System.out.print(i.next() + " ");
    }

}
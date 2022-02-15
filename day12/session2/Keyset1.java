import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Keyset1
 */
public class Keyset1 {

    public static void main(String[] args) {
        
        HashMap<Integer,Character> hm = new HashMap<>();

        hm.put(1,'a');
        hm.put(2,'b');
        hm.put(3,'c');
        hm.put(4,'d');

        System.out.println(hm);
        System.out.println(hm.keySet());

        Set k = hm.keySet();

        System.out.println(k);
        Iterator i = k.iterator();
        while (i.hasNext()) {
            System.out.print(i.next());
        }

    }

}
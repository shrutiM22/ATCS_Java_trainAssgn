import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hashmap3 {
    
    public static void main(String[] args) {
        
        HashMap h = new HashMap<>();

        h.put('d',1);
        h.put('o',2);
        h.put('i',3);
        h.put('t',4);

        Set s = h.keySet();
        
        //Iterator i = s.iterator();
        //while(i)
        System.out.println(s);



    }

}

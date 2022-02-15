import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class Entryset2 {
    

    public static void main(String[] args) {
        
        HashMap<Integer,String> m = new HashMap<>();

        m.put(101,"Kim");
        m.put(102,"Kourtney");
        m.put(103,"Chloe");
        m.put(104,"Kendel");
        m.put(105,"Kylie");

        Set<Entry<Integer,String>> s = m.entrySet();

        System.out.println(s);
        Iterator i = s.iterator();
        while(i.hasNext())
            System.out.print(i.next());
    }
}

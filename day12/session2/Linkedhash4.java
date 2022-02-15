import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Linkedhash4 {
    
    public static void main(String[] args) {
        
        LinkedHashMap m = new LinkedHashMap<>();

        m.put(1,"we");
        m.put(2,"have");
        m.put(3,"a");
        m.put(4,"meeting");
        m.put(5,"now");

        System.out.println(m);

        Set e = m.entrySet();
        Set k = m.keySet();
        System.out.println("Through entry set "+e);
        System.out.println("Through key set " +k);
        


    }

}

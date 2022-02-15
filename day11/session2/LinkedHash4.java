import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHash4 {
 
    
    public static void main(String[] args) {
        
        LinkedHashSet lh = new LinkedHashSet<>();

        lh.add("There");
        lh.add("are");
        lh.add(100);
        lh.add("circles");
        lh.add("hanging at");
        lh.add(67.5f);
        lh.add(true);
        lh.add("degrees");

        System.out.print(lh + " ");
        System.out.println("\n\nusing iterator");
        Iterator i = lh.iterator();
        while(i.hasNext())
            System.out.print(i.next() + " ");
    }
}

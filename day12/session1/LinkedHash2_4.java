import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHash2_4 {
    
    public static void main(String[] args) {
        
        LinkedHashSet lh = new LinkedHashSet<>();

        for(int i =1;i<=10;i++)
            lh.add(i);

        System.out.println(lh);

        lh.add(100);
        lh.add("Taylor");
        lh.add('J');
        System.out.println(lh);

        Iterator it = lh.iterator();
        while(it.hasNext())
            System.out.print(it.next() +" ");

    }

}

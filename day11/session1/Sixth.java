import java.util.ArrayList;
import java.util.Iterator;

public class Sixth {
    

    public static void main(String[] args) {
        
        ArrayList<Integer> a= new ArrayList<Integer>();

        a.add(1);
        a.add(2);
        a.add(3);

        Iterator i = a.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}

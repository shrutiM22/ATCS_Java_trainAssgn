/**
 * ArraylistEx
 */
import java.util.ArrayList;
import java.util.LinkedList;



public class ArraylistEx {

    public static void main(String[] args) {
        
        ArrayList a = new ArrayList();

        LinkedList l = new LinkedList();

        //for array list
        a.add("Today's");
        a.add("date");
        a.add(new Integer(14));
        a.add(true);
        a.add('f');
        a.add(27.3f);
        a.add(null);
        System.out.println("Arraylist\n");
        System.out.println("all the values " + a);

        //for linked list
        l.add("Today's");
        l.add("date");
        l.add(new Integer(14));
        l.add(true);
        l.add('f');
        l.add(27.3f);
        l.add(null);

        System.out.println("\nlinkedlist \n");
        System.out.println("list size "+l.size());
        System.out.println("contains date "+l.contains("date"));
        System.out.println("get first element "+l.getFirst());
        System.out.println("get last element "+l.getLast());
        System.out.println("is empty "+l.isEmpty());
        System.out.println("ith index "+l.remove(4));
        System.out.println("size "+l.size());
        System.out.println("remove "+l.remove());
        l.add("February");
        System.out.println("size " +l.size());

    }
}
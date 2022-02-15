import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1_2 {
    
    public static void main(String[] args) {
        
        Queue<Character> ql = new LinkedList<Character>();

        ql.add('a');
        ql.add('b');
        ql.add('c');

        System.out.println("\nQueue using linked list\n");
        Iterator iq = ql.iterator();
        while(iq.hasNext())
            System.out.print(iq.next() + " ");

        PriorityQueue<Character> q = new PriorityQueue<Character>();

        q.add('T');
        q.add('u');
        q.add('e');
        q.add('s');
        q.add('d');
        q.add('a');
        q.add('y');

        System.out.println("\nQueue using queue collection");
        System.out.print(q + " ");
        System.out.println("Head- " +q.element());
        System.out.println(q.peek());
        System.out.println(q.isEmpty() );
        System.out.println(q.poll());
        System.out.println(q.remove());

        

        Iterator i=q.iterator();
        while(i.hasNext())
            System.out.print(i.next());

    }

}

import java.util.ArrayList;
import java.util.ListIterator;

public class Seventh {
    
    public static void main(String[] args) {
        
        ArrayList<String> b = new ArrayList<String>();
        
        b.add("Hello");
        b.add("good");
        b.add("evening");
        b.add("It's");
        b.add("9.00");
        b.add("now");

        ListIterator ltr = b.listIterator();
        while(ltr.hasNext())
            System.out.print(ltr.next() +" ");
            
        System.out.println("\nReverse-");
        while(ltr.hasPrevious())
            System.out.print(ltr.previous() +" ");
            
        

    }


}




    
    


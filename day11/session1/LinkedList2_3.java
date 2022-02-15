import java.util.LinkedList;

public class LinkedList2_3 {
    
    public static void main(String[] args) {
        
        LinkedList l = new LinkedList<>();

        l.add("Monday");
        l.add(70);
        l.add(56.7f);
        l.add(true);
        l.add("cricket");
        l.add('s');

        System.out.println(l.getFirst()); 
        System.out.println(l.getLast()); 
        System.out.println(l.remove()); 
        System.out.println(l.size()); 
        l.add("evening");
        l.add(100);
        System.out.println(l.size()); 
        System.out.println(l.remove(3)); 
        System.out.println(l.contains(70)); 
        System.out.println(l.isEmpty()); 


    }
}

import java.util.HashSet;

public class Hashset3 {
    
    public static void main(String[] args) {
        
        HashSet h = new HashSet<>();

        h.add("Bottle");
        h.add(9.2f);
        h.add('w');
        h.add(200);
        h.add(true);
        h.add(null);
        h.add(2323.21d);

        System.out.print(h + " ");

    }

}

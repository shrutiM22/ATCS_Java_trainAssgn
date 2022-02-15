import java.util.HashSet;

public class Hashset5 {
    
    public static void main(String[] args) {
        
        HashSet<Float> hs = new HashSet<Float>();

        hs.add(1.89f);
        hs.add(5.6f);
        hs.add(9.9f);
        hs.add(3.33f);

        System.out.println(hs);

        HashSet<Float> hh = new HashSet<Float>();

        hh.add(22.2f);
        hh.add(16.24f);
        hh.add(25.25f);
        hs.addAll(hh);
        System.out.println(hs);

        hs.retainAll(hh);
        System.out.println(hs);

        System.out.println(hs.remove(16.24f)); 
        System.out.println(hs);


    }
}

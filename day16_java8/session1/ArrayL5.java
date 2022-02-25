import java.util.ArrayList;

interface Interf {

    public void m();
    
}

public class ArrayL5 {
    

    public static void main(String[] args) {
        
        Interf i = () -> {
            ArrayList a = new ArrayList<>();
            a.add("jdbc");
            a.add("odbc");
            a.add("native");
            a.add("thin");
            
            System.out.println(a);
    
        };
        i.m();
    }
    
}

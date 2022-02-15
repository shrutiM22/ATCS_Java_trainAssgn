import java.util.ArrayList;

public class Test4 {
    
    public static void main(String[] args) {
        
        ArrayList al = new ArrayList<>();

        al.add("Monday");
        al.add(100);
        al.add(200.1f);
        al.add(true);
        al.add("cricket");
        al.add('d');

        System.out.println("--using for loop---");
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i) +" ");
        }

        System.out.println("\n--using for each loop--");
        for(Object o:al)
            System.out.print(o +" ");


        
    }
}

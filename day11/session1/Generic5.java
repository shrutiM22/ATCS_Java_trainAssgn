import java.util.ArrayList;

public class Generic5 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> a = new ArrayList<Integer>();
        int sum=0;
        a.add(18);
        a.add(20);
        a.add(34);
        a.add(49);
        a.add(32);
        a.add(111);
        a.add(10);
        a.add(12);
        a.add(19);
        a.add(57);

        for(int i =0;i<a.size();i++){
            sum= sum+a.get(i);
        }
        System.out.println("sum of numbers in list is: " +sum);
        System.out.println("\neven numbers- "); 
        for(int i=0;i<a.size();i++)
        {
            if(a.get(i)%2 == 0)
                System.out.print(a.get(i) + " ");
        }



    }
}

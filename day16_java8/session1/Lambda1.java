/**
 * Lambda1
 */
/**
 * InnerLambda1
 */
interface InnerLambda1 {

   // public void m();
    public int m1(int a);
}

public class Lambda1 {

    
    public static void main(String[] args) {

        // InnerLambda1 i = () -> System.out.println("Good morning");
        InnerLambda1 i1 = a -> a;
        //i.m();
        System.out.println(i1.m1(10)); ;
        
    }
}
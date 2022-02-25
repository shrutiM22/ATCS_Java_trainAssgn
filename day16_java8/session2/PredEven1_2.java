interface Predicate<E>{

    public boolean test(E e);
}

public class PredEven1_2 {
    

    public static void main(String[] args) {
        
        Predicate<Integer> p = e ->e%2==0;  // e%2==0 ? true : false;
        
        Predicate<String> p2 = s-> s.length()==6;

        System.out.println(p.test(12)); 
        System.out.println(p2.test("samantha"));

    }

}

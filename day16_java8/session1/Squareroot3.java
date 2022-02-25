interface I{

    public void s(int q);
}

public class Squareroot3 {
    
    public static void main(String[] args) {
        
        I i = (q) -> {

            double sq = Math.sqrt(q);
            System.out.println(sq);

        };
        i.s(9);

    }

}

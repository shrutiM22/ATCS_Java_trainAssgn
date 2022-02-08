public class Sqrt4 {
    
    public static void main(String[] args) {
        int n =37;
        double t, sq=n/2;

        do{
            t = sq;
            sq = (t+(n/t))/2;
        }while((t-sq)!=0);
        System.out.println(String.format("%.2f",sq));
    }

}

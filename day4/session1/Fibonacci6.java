public class Fibonacci6 {
    int n = 7;
    void fib(){
        int o = 0, t =1,n2;
        System.out.print(o + " " + t +" ");
        for(int i=0;i<n;i++){
            n2 = o+t;
            System.out.print(n2 +" ");
            o=t;
            t=n2;
        }
    }

    public static void main(String[] args) {
        Fibonacci6 f = new Fibonacci6();
        f.fib();
    }

}

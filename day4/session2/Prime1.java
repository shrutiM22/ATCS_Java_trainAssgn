/**
 * Prime1
 */
public class Prime1 {
    int n=100;
    void pr(){
        int count=0;
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0)
                    count++;
            }
            if(count ==2)
                System.out.print(" " + i + " ");
            count=0;
            
            
        }
    }

    public static void main(String[] args) {
        Prime1 p = new Prime1();
        p.pr();
    }
}
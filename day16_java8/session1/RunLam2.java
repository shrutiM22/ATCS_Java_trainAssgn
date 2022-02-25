

public class RunLam2 {
    
    public static void main(String[] args) {
        
        Runnable r = ()->{
            for(int i=0;i<2;i++)
                System.out.println("I was unable to go for cycling");
        };

        Thread t =  new Thread(r);
        t.start();

        for(int i=0;i<2;i++)
            System.out.println("Today");
        

    }
}

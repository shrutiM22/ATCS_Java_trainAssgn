public class Thread2 implements Runnable{
    
    public void run(){
        for(int i=0;i<5;i++)
            System.out.println("evening thread");
    }
    public static void main(String[] args) {
        
        Thread2 t2 = new Thread2();
        Thread t = new Thread(t2);
        t.start();
        for(int i=0;i<5;i++)
            System.out.println("main thread");


    }
}

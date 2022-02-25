public class Join6 extends Thread{
    
    public void run(){
        for(int i =0;i<4;i++)
            System.out.println("Tea thread");

    }
    public static void main(String[] args) throws InterruptedException{
        Join6 j = new Join6();
        j.start();
        j.join(3000);
        for(int i =0;i<4;i++)
            System.out.println("Coffee thread");
        Thread.yield();
    }
}

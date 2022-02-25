/**
 * Thread1
 */
public class Thread1 extends Thread {

    @Override
    public void run(){
        System.out.println("Monday thread");
    }
    public static void main(String[] args) {
        Thread1 t = new Thread1();
        t.start();
        System.out.println("main thread");


    }
}
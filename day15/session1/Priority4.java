public class Priority4 extends Thread{
    
    public void run(){

        Thread.currentThread().setPriority(8);
        System.out.println("Child thread- "+ Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        Priority4 p = new Priority4();
        p.start();
        System.out.println("main class before setting priority- " +Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(6);
        System.out.println("main thread- " +Thread.currentThread().getPriority());

    }
}

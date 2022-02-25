public class Name3 extends Thread {
    
    public void run(){

        //Thread.currentThread().setName("kyl");

        System.out.println("Child thread- " + Thread.currentThread().getName());
    }
    
    public static void main(String[] args) {
        
        Name3 n = new Name3();
        n.start();
        n.setName("kyl");
        System.out.println("before naming thread- " +Thread.currentThread().getName());
        Thread.currentThread().setName("ken");
        System.out.println("Main thread- " + Thread.currentThread().getName());
    }
}

/**
 * Deadlock1
 */

class A{

    public synchronized void c1(B b){
        System.out.println("thread 1 starts execution of c1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread 1 try to call class b");
        b.last();


    }

    public void last(){
        System.out.println("last method of A class");
    }

}

class B{

    public synchronized void c2(A a){
        System.out.println("Thread 2 starts execution of c2");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread 2 try to call class a");
        a.last();
    }
    public void last(){
        System.out.println("last method of B class");
    }

}


public class Deadlock1 extends Thread {

    A a = new A();
    B b = new B();

    public void d1(){
        this.start();
        a.c1(b);
    }

    public void run(){
        b.c2(a);
    }

    public static void main(String[] args) {
        Deadlock1 d = new Deadlock1();
        d.d1();

    }
    

    


}
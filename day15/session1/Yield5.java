public class Yield5 extends Thread{
    
    public void run(){

        for(int i =0;i<4;i++){
            System.out.println("play thread");
            
        }
            
    }
    public static void main(String[] args) {
        Yield5 y = new Yield5();
        y.start();
        
        for(int i =0;i<4;i++){
            System.out.println("cycle thread");
            Thread.yield();
        }
    }
}

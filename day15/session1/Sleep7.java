public class Sleep7 extends Thread{
    
    public void run(){
        for(int i =0;i<4;i++){
            System.out.println("beach thread");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                //TODO: handle exception
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Sleep7 s = new Sleep7();
        s.start();
        for(int i =0;i<4;i++)
            System.out.println("mountain thread");

    }
}

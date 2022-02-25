class Cyc{
    float ptime ;
    float stime;
    synchronized void play(float ptime){
        System.out.println("Wolf will going to play");

        if(ptime<5){
            System.out.println("Wolf will wait to play ");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("this time wolf either playing or studing"); 


    } 

    synchronized void study(float stime){
        if(stime>3 && ptime>=5)
            System.out.println("wolf studied and can go to play");
        else
            System.out.println("need to study properly");
        notify();

    }

}


public class Activity2_3 {
    public static void main(String[] args) {
        
        Cyc a = new Cyc();
        new Thread(){

            public void run(){
                a.play(4.30f);
            }
        }.start();

        new Thread(){
            public void run(){
                a.study(4);
            }
        }.start();
    }


}

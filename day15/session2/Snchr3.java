class Account{
    int amount;

    synchronized void withdraw(int amount){

        if(this.amount>8000){
            System.out.println("money can't be withdrawn due to less balance");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("withdrawing amount");
        this.amount -= amount;
            

    }

    synchronized void deposit(int amount){
        System.out.println("depositing money in account");
        this.amount += amount;
        System.out.println("deposition completed");
        notify();
    }

    
}

public class Snchr3 {
    
    public static void main(String[] args) {
        
        
        Account a = new Account();

        new Thread(){
            public void run(){
                a.withdraw(10000);
            }
        }.start();

        new Thread(){
            public void run(){
                a.deposit(20000);
            }
        }.start();
        

      
    }


}

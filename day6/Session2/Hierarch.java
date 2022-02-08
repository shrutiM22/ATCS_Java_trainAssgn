class Account{
    int no = 3567;
    String name = "Axis Bank";

    void get(){
        System.out.println("This is an account");
    }
}

class Saving extends Account{
    void getacc(){
        System.out.println("account number is: " +no);
    }

}

class  Current extends Account{
    void getac(){
        System.out.println("From bank: " + name);
    }
}

public class Hierarch extends Account {
 
    public static void main(String[] args) {
        Hierarch h = new Hierarch();
        h.get();

        Saving s = new Saving();
        s.getacc();

        Current c = new Current();
        c.getac();

    }
}

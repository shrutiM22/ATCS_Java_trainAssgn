class Wrist{
    void getw(){
        System.out.println("wrist watches looks great!");
    }
}

class Wall{
    void getcl(){
        System.out.println("wall clocks are of diff sizes.");
    }
}



public class Multiplein extends Wrist, Wall {
    public static void main(String[] args) {
        
        Multiplein m = new Multiplein();
        m.getw();
        m.getcl();
    }
}

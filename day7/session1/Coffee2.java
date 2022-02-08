abstract class Beverage{
    String quantity = "20 ml";
    void addMilk(){
        System.out.println("Adding milk");
    }
    abstract void addIngredient();
}

class Tea extends Beverage{
    void makeT(){
        System.out.println("Adding "+ quantity + " milk to make tea" );
    }
    @Override
    void addIngredient(){
        System.out.println("adding tealeaves and ginger");
    }
}

public class Coffee2 extends Beverage {

    void makeCoff(){
        System.out.println("making coffee now");
    }
    public static void main(String[] args) {
        Tea t = new Tea();
        t.addMilk();
        t.makeT();
        t.addIngredient();

        Coffee2 c = new Coffee2();
        c.makeCoff();
        c.addIngredient();
    }

    @Override
    void addIngredient(){
        System.out.println("Adding " + quantity + " milk to make coffee");
    }
    
}
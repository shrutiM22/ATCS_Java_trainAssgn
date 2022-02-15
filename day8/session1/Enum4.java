enum Drink{

    beverage, alcohol, water,
}

public class Enum4 {
    
    public static void main(String[] args) {
        
        for(Drink d: Drink.values())
            System.out.println(d);

    }



}

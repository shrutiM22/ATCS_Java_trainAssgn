public class ConstChain7 {
    public ConstChain7(){
        this("Hand bags");
        System.out.println("This is default const");
        System.out.println(this);
        
    }
    public ConstChain7(String item){
        this(10);
        System.out.println("I want to buy");
    }
    public ConstChain7(int q){
        System.out.println( "new");
        
    }


    public static void main(String[] args) {
        ConstChain7 c = new ConstChain7();
    }


}

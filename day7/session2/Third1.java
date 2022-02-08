class one{
    protected int a = 1;
    protected void dis(){
        System.out.println("this is class one");
    }
    private void show(){
        System.out.println("this is show method of class one");
    }
} 

public class Third1 extends one{

    public static void main(String[] args) {
        Third1 t = new Third1();
        one o = new one();
        t.dis();
        System.out.println("this is program " + o.a);
        //o.show();
    }
}
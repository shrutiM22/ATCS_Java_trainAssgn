
class Flower{
    void f(){
        System.out.println("this is flower class");
    }
}

class Plant extends Flower{
    void p(){
        System.out.println("this is plant class");
    }
}

public class Multilevelin extends Plant {
    
    public static void main(String[] args) {
        Multilevelin m = new Multilevelin();
        m.f();
        m.p();
    }
}

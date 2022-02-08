class Animal {
    void get(){
        System.out.println("Animals have no brain");
    }
}

/**
 * Dog3
 */
public class Dog3 extends Animal {

    @Override
    void get(){
        System.out.println("Dogs are smart animal as well as dumb.");
    }
    public static void main(String[] args) {
        Dog3 d = new Dog3();
        d.get();
    }
}


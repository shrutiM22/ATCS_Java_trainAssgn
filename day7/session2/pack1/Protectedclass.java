package pack1;

public class Protectedclass {
    protected void show(){
        System.out.println("this is protected class method");
    }

    public static void main(String[] args) {
        Protectedclass pc = new Protectedclass();
        pc.show();
    }
}

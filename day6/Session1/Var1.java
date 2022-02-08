public class Var1 {
    static int v1;
    static float v2;
    static char v3;
    int v4;
    float v5;
    char v6;
    boolean v7; 


    public static void main(String[] args) {
        Var1 v = new Var1();
        System.out.println("static int: "+Var1.v1);
        System.out.println("static float: "+Var1.v2);
        System.out.println("static char: "+Var1.v3);
        System.out.println("instance char: "+v.v4);
        System.out.println("instance float: "+v.v5);
        System.out.println("instance char: "+v.v6);
        System.out.println("instance boolean: "+v.v7);
    }
}

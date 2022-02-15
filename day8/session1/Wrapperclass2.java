public class Wrapperclass2 {
    
    public static void main(String[] args) {
        
        int a = 10;
        char b = 'g';
        float c = 1.2f;
        boolean d = true;

        //autoboxing
        Integer ai = a;
        Character bc = b;
        Float ff = c;
        Boolean bb = d;

        System.out.println("Integer object- " + ai);
        System.out.println("Character object- " + bc);
        System.out.println("Float object- " + ff);
        System.out.println("Boolean object- " + bb);

        //unboxing
        int aa = ai;
        char bbc = bc;
        float cc = ff;
        boolean dd = bb;

        System.out.println("int value- " + aa);
        System.out.println("char value- " + bbc);
        System.out.println("float value- " + cc);
        System.out.println("boolean value- " + dd);

    }


}

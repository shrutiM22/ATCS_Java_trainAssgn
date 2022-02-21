import java.util.Scanner;

public class DivW2 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("enter number 1: ");
        int a = s.nextInt();
        System.out.println("enter number 2: ");
        int b = s.nextInt();

        try {
            int z = a/b;
            System.out.println("division of a by b is- " +z);
        } catch (Throwable e) {
            //TODO: handle exception
            System.out.println("don't take 0 as denominator");
        }
        System.out.println("rem lines of code");
        
    }
}

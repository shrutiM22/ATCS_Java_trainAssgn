import java.util.Scanner;

/**
 * DivWo1
 */
public class DivWo1 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("enter number 1: ");
        int a = s.nextInt();
        System.out.println("enter number 2: ");
        int b = s.nextInt();

        int z = a/b;
        System.out.println("division of a by b is- " +z);
    }
}
import java.util.Scanner;

public class Palindrome2 {
    //Scanner sc = new Scanner();
    //int n = sc.nextInt(System.in);
    
    public static void main(String[] args) {
        int n = 1221,t=0;
        int temp = n;
        while(temp!=0){
            
        
        int r = temp%10;
        t = t*10+r;
        temp = temp/10;
        }
        if(t == n)
            System.out.println(t +" is palindrome "  );
        else
            System.out.println(t + " is not palindrome " );
        


    }

}

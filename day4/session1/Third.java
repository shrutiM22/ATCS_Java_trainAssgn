/**
 * Third
 */
import java.io.*;

public class Third {

    public double compInterest(double p,double r,double t){
        double ci = p*(Math.pow((1+r/100),t));
        return ci;   
    }

    public double power(int num,int r){
        double p = Math.pow(num,r);
        return p;
    }

    public int swap(int a,int b){
        int temp=0;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a- "+a);
        System.out.println("b- "+b);
        return 0;
    }

    public static void main(String[] args) {
        Third t = new Third();
        //System.out.println("compound interest is:" + t.compInterest(10000,12,3));
        System.out.println("Power of number is:" + t.power(2,3));
        t.swap(2,3);
    }


    
}
public class Calculator4_5 {
    //static methods q4 
    static int statcal(){
        int n1=5,n2=3;
        return n1+n2;
    }
    static void statcal2(){
        int n1=1,n2=9;
        int n = n1*n2;
        System.out.println("multiplication of n1 and n2 is(static): "+n);
    }

    //instance methods q5

    int instcal(){
        int n1=6,n2=5;
        return n1-n2;
    }

    static void instcal2(){
        int n1=75,n2=5;
        int n = n1/n2;
        System.out.println("Division of n1 and n2 is (instance): "+n);
    }

    public static void main(String[] args) {
        System.out.println("Addition of n1 and n2 is(static): " +Calculator4_5.statcal()); 
        Calculator4_5.statcal2();
        Calculator4_5 c = new Calculator4_5();
        System.out.println("Subtraction of n1 and n2 is(instance): " +c.instcal()); 
        c.instcal2();
    }
}

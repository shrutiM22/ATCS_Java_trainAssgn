public class Add3 {
    int a=1,b=5;
    int c = a+b;
    int add(){
        return a+b;
    }
    void add2(){
        if(a==1)
            System.out.println("using if else: " + c);
        else
            System.out.println("can't add");
    }
    void add3(){
        while(a!=0){
            System.out.println("using while loop " + c);
            a--;
    }
    }
    void add4(){
        for(int i=0;i<1;i++)
            System.out.println("Using for loop " + c);
    }
    void add5(){
        
        switch (a) {
            case 0:
                System.out.println("can't add"); 
                break;
            case 1:
                System.out.println("using switch case: " + c);
                break;
            default:
                break;
        }
    }
    public static void main(String[] args) {
        Add3 a = new Add3();
        System.out.println("adding normally: " +a.add());
        a.add2();
        a.add3();
        a.add4();
        a.add5();

    }
}

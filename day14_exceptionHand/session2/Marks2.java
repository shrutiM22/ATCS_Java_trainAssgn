public class Marks2 {
    
    public void validmarks(int marks){
        if(marks<40)
            throw new ArithmeticException("you didnot pass");
        else
            System.out.println("you are passed ");
    }
    public static void main(String[] args) {
        Marks2 m = new Marks2();
        m.validmarks(60);
        System.out.println("congratulations!!");
    }
}

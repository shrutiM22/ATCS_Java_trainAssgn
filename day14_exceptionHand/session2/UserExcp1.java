/**
 * UserExcp1
 */
class test extends Exception{
    private int age;
    

    public test(int age){
        this.age = age;
    }

    public String toString(){
        return "you are not eligible to watch movie";
    }
}

public class UserExcp1 {

    static void excp(int age) throws test{
        if(age<13)
            throw new test(age);
        else
            System.out.println("you can watch this movie " +age);
    }
    public static void main(String[] args) throws test{
        UserExcp1.excp(18);
        System.out.println("rem lines of code");
    }
}
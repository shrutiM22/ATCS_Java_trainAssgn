class Refc{
    void display(){
        System.out.println("This is another class referred by main");
    }
}

public class Ques3 {

    public static void main(String[] args) {
        Refc r = new Refc();
        r.display();

    }
}

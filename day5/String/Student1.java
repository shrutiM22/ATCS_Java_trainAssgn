public class Student1 {
    
    int id = 10001;
    String name = "Hermoine";
    String branch = "cs";

    public void get(){
        
        System.out.println("name: " + name + "\nbranch: " + branch);

    }

    public static void main(String[] args) {
        Student1 s = new Student1();
        s.get();
    }
}

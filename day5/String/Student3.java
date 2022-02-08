public class Student3 {
    String name;
    int batch;
    String subject;

    Student3(){
        System.out.println("Student info");
    }
    Student3(String n,int b,String s){
        name = n;
        batch = b;
        subject = s;
    }

    void get(){
        System.out.println("name: " + name);
        System.out.println("Batch: " + batch);
        System.out.println("Subject: " + subject);
    }

    public static void main(String[] args) {
        Student3 s = new Student3();
        Student3 s2 = new Student3("Srivalli",1,"PCM");
        s2.get();
    }
}

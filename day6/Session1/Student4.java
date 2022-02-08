public class Student4 {
    String name , address ;


    public Student4(String n, String a){
        name =n;
        address = a;
    }

    static void put(String name, String add){
        System.out.println(name + " lives in " + add);
    }

    void get(){
        System.out.println(name + " lives in " + address);
    }   


    public static void main(String[] args) {
        Student4 s = new Student4("Julia", "London");
        s.get();
        Student4.put("Valentina","Chicago");
    }
}

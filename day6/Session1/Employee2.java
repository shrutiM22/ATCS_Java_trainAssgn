public class Employee2{

    public void emp(){
        int id = 101;
        String name = "Christan";
        String desgn = "Manager";
        System.out.println(name + "\nDesignation: " +desgn);
    }

    public static void main(String[] args) {
        Employee2 e = new Employee2();
        e.emp();

    }
}
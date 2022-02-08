class Employee{
    //int id;
    //String name;
    void display(String desgn,String name){
        System.out.println( name + " is a " + desgn);
    }
}

public class ArrayOfObj1{
    public static void main(String[] args) {
        
        Employee[] err = new Employee[5];
        err[0] = new Employee();
        err[1] = new Employee();
        err[2] = new Employee();
        err[3] = new Employee();
        err[4] = new Employee();

        err[0].display("Software Developer","Elspeth");
        err[1].display("Civil Engineer","Robert");
        err[2].display("Interior Designer","Jack");
        err[3].display("Data Scientist","Jessica");
        err[4].display("Professor","Edie");

    }


}



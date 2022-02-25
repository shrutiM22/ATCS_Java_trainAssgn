import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.Predicate;


class Employee {
    int salary;
    String name;

    public Employee(String n,int i){
        this.salary = i;
        this.name = n;
    }

    public String toString(){
        return name +" " + salary;
    }

    int getsal(){
        return salary;
    }
}

public class Emp3 {
    
    public static void main(String[] args) {
        
        
        ArrayList<Employee> a = new ArrayList<Employee>(); 
        

        a.add(new Employee("Nandita",9900));
        a.add(new Employee("Bikram",8000));
        a.add(new Employee("Bala",5000));
        a.add(new Employee("Satya",4000));

        for (Employee e : a) {
            Predicate<Integer> p = i-> e.getsal() >7000;
            if(p.test(e.getsal()))
                System.out.println(e.getsal() + " "+ e.name);
            
        }






    }
}

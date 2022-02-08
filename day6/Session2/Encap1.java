/**
 * encap1
 */
class Vehicle{
    private String name;
    private String type;
    private int quantity;
    
    public String getN(){
        return name;
    }
    public void setN(String n){
        this.name = n;
    }
    

    public String  getT(){
        return type;
    }
    public void  setT(String t){
        this.type = t;
    }

    public int getQ(){
        return quantity;
    }
    public void setQ(int q){
        this.quantity = q;
    }
}

 public class Encap1 {
    public static void main(String[] args) {
        Vehicle d = new Vehicle();
        d.setN("Jaguar");
        d.setT("cars");
        d.setQ(10);

        System.out.println("I have " +d.getQ() + " " + d.getT() + " and all are " + d.getN()) ;
    }
    
}
interface In{
    public int m(int a,int b);
}

public class Addition4 {
    
    public static void main(String[] args) {
        
        In i = (a,b) -> a+b;
        System.out.println("addition- " + i.m(9,99)); 
    }
    
}

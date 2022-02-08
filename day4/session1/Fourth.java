class Circle{
    Circle(){
        System.out.println("Circle");
    }
    public double circum(float r){
        double c = 2*3.14*r;
        System.out.println("circumference: "+c);
        return 0;
    }
    public float area(float r){
        float a = 3.14f*r*r;
        System.out.println("Area of circle: " +a);
        return 0;
    }
}

public class Fourth {
    public double rect(float l,float b){
        double a = l*b;
        return a;
    }

    public static void main(String[] args) {
        Fourth f = new Fourth();
        Circle c =new Circle();
        System.out.println("Area of rectangle is: " +f.rect(2,22));
        c.circum(4);
        c.area(5);

        char ch = 's';
        int ascii = (int)ch;
        char cc = 'S';
        int a = cc;
        System.out.println("ascii value of " +ch + ":" +ascii);
        System.out.println("ascii value of " +cc + ":" +a);
    }
}

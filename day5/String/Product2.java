public class Product2 {
    String name;
    int price;
    String warranty;
    public Product2(String n,int p,String w){
        name = n;
        price = p;
        warranty = w;

    }

    public void get(){
        System.out.println("Product details-\n" + name + "\n" + price + "\n" + warranty);
    }

    public static void main(String[] args) {
        Product2 p = new Product2("Refrigerator",15000,"2 years");
        p.get();
    }

}

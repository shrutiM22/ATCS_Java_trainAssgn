class Book{
    String name = "The Invisible man";
    String type= "Fictious";
    String author ="H.G Wells";
    
    

    public void getsimple(){
        System.out.println(name + " is a " + type + " book ");
    }
}


public class Simpleinherit extends Book {
  

    public static void main(String[] args) {

        
        Simpleinherit b = new Simpleinherit();
        b.getsimple();
        System.out.println(b.name);
       
    }
}

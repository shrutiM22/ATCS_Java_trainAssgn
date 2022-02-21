import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintW5 {
    
    public static void main(String[] args) throws IOException{
        FileWriter f = new FileWriter("hello.txt");
        PrintWriter p = new PrintWriter(f);

        p.write("Through print writer");
        p.close();
        System.out.println("written using printwriter");


    }
}

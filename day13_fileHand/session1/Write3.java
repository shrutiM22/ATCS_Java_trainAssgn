import java.io.FileWriter;
import java.io.IOException;

public class Write3 {
 
    public static void main(String[] args) throws IOException{
        FileWriter f = new FileWriter("hello.txt");
        f.write("Hello");
        f.write("Today I have do lots of assgn");
        f.close();
        System.out.println("Written");

    }

}

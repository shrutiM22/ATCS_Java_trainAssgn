import java.io.File;
import java.io.IOException;

/**
 * Demo1
 */
public class Demo1 {

    public static void main(String[] args) throws IOException{
        
        File f = new File("hello.txt");
        f.createNewFile();
        System.out.println("File is created");
        



    }

}




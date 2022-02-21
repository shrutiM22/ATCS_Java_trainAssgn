import java.io.FileReader;
import java.io.IOException;

public class Readf6 {
    
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("hello.txt");
        int i;
        while((i = fr.read())!=-1){

            //String c = (String) fr.read
            System.out.print((char)i + " ");
        }


    }
}

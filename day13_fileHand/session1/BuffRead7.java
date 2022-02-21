import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuffRead7 {
    
    public static void main(String[] args) throws IOException{
        
        FileReader f = new FileReader("hello.txt");
        BufferedReader br = new BufferedReader(f);
        int i;
        while((i = br.read())!= -1){
            System.out.print((char)i);
        }



    }
}

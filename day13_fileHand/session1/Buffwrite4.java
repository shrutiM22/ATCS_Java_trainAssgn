import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffwrite4 {
    
    public static void main(String[] args) throws IOException{
        FileWriter f = new FileWriter("hello.txt");
        BufferedWriter bfw = new BufferedWriter(f);

        bfw.write(21);
        bfw.write("date");
        bfw.close();
        System.out.println("added more info");

    }

}

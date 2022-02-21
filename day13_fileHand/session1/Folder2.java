import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Folder2 {
    
    public static void main(String[] args) throws IOException{
        
        Scanner s = new Scanner(System.in);
        System.out.println("ENter the path of folder: ");
        String path = s.next();
        System.out.println("Enter the directory name: ");
        path = path + s.next();
        File f = new File(path);
        //creating a folder
        boolean b = f.mkdir();
        if(b)
            System.out.println("Folder created");
        else
            System.out.println("error!");
        System.out.println("Enter the file name: ");
        path = path + s.next();
        File f1 = new File(path);
        boolean bb = f1.createNewFile();
        if(bb)
            System.out.println("file created");
        else
            System.out.println("error!");
        System.out.println("projectfilecreated");

            
        


    }
}

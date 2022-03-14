import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Access {
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter username");
		String uname=sc.next();
		System.out.println("Enter password");
		String pss=sc.next();
		

        Class.forName("org.postgresql.Driver");

	 

        Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","test");



             PreparedStatement stmt=conn.prepareStatement("select * from users where name=? and password=?");
             
              stmt.setString(1, uname);
              stmt.setString(2, pss);
              
              ResultSet result=stmt.executeQuery();
              
              if(result.next()) {
            	  System.out.println("login successfull");
              }else
              {
            	  System.out.println("login denied....incorrect username and password ,enter correct details");
              }
              
              conn.close();
	}

}

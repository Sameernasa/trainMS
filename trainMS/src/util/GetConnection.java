package util;
import java.sql.*;
public class GetConnection {
public static Connection con;
public static Connection getDBConnection(){
	try
	  {
	   Class.forName("oracle.jdbc.driver.OracleDriver");
	   con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","123456");
	   System.out.println("connection done");
	  }
	  catch(Exception e)
	  {
		  System.out.println("error in connection");
		  System.out.println(e);
	  }
	return con;
}

}

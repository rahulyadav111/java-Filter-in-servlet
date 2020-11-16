package packk;
import java.sql.*;
public class DbConnection
{
	private static Connection conn;
	static {
		try{
			
		Class.forName("oracle.jdbc.driver.OracleDriver");
	conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
		
		
		}catch (Exception e)
		{
			e.printStackTrace();
		
		}
	}
	public static Connection getConnection()
	{
		return conn;
	}


}

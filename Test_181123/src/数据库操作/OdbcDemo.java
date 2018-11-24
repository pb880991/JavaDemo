package 数据库操作;
import java.sql.*;

public class OdbcDemo {
	public static void main(String[] args) throws Exception {
		Connection connection = con();
		System.out.println(connection.toString());
		
	}
	
	public static Connection con() throws Exception {
		String DRIVER = "com.oscar.Driver";
		String URL = "jdbc:oscar:localhost:2003/METDATA;";
		Class.forName(DRIVER);
		Connection conn = DriverManager.getConnection(URL, "SYSDBA", "bbelpzsf520");
		return conn;
	}
}

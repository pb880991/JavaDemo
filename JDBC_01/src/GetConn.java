import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Date;
import org.junit.Test;


//准备工作
//1.拷贝MySQL驱动包到项目中mysql....jar
//2/.build path，告诉项目去哪里找字节码文件
public class GetConn {

	public static void main(String[] args) {

	}

	@Test
	public void test1() throws Exception {
		// 1.加载注册驱动
		Class.forName("com.oscar.Driver");
		// 2.获取链接对象
		Connection connection = DriverManager.getConnection("jdbc:oscar://localhost:2003/OSRDB", "SYSDBA",
				"bbelpzsf520");
		Thread.sleep(2000);
	}

	@Test
	public void test2() throws Exception {

		// 1.加载注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		// 2.获取链接对象
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/METDATA", "root",
				"Bbelpzsf520");
		Thread.sleep(2000);
	}

	@Test
	public void testInsert() throws Exception {
		String query = "INSERT INTO `METDATA`.`PUBLIC_FLDHOUR` (`colid`, `coldate`, `colvv`, `colff`) VALUES ('4', '2018-11-20 04:00:00', '90', '36');";
		// 1.加载注册驱动
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 2.获取链接对象
		Connection connection = null;
		java.sql.Statement statement = null;
		// int executeUpdate(String sql);执行DML/DDL语句
		// DML返回的是受影响的行数，DDL返回0
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/METDATA", "root",
					"Bbelpzsf520");
			statement = connection.createStatement();
			Thread.sleep(2000);
			//执行
			int row = statement.executeUpdate(query);
			System.out.println(row);
		} catch (Exception e) {
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
			} catch (Exception e2) {
			} finally {
				try {
					if (connection != null) {
						connection.close();
					}
				} catch (Exception e3) {
				}
			}
		}
	}

	@Test
	public void testQuery() throws Exception {
		String sql = "SELECT * from `METDATA`.`PUBLIC_FLDHOUR` where colid = '2';";
		// 1.加载注册驱动
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 2.获取链接对象
		Connection connection = null;
		java.sql.Statement statement = null;
		// int executeUpdate(String sql);执行DML/DDL语句
		// DML返回的是受影响的行数，DDL返回0
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/METDATA", "root",
					"Bbelpzsf520");
			statement = connection.createStatement();
			Thread.sleep(2000);
			//执行
			ResultSet rs = statement.executeQuery(sql);
			if(rs.next()) {
				//查询结果从1开始
				Date dat = rs.getDate(2);
				System.out.println(dat);
			}
		} catch (Exception e) {
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
			} catch (Exception e2) {
			} finally {
				try {
					if (connection != null) {
						connection.close();
					}
				} catch (Exception e3) {
				}
			}
		}
	}
}

<<<<<<< HEAD
package kr.ac.dealim.homework002;
import java.sql.*;
public class DBConnection {

	public static Connection getDBConn() throws SQLException{
		// TODO Auto-generated method stub
		System.out.println("CALLED - CLASS: DBConnection METHOD: getDBConn()");
		
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String DB_USER = "hr";
			String DB_PASSWORD = "hr";
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}

}
=======
package kr.ac.dealim.homework002;
import java.sql.*;
public class DBConnection {

	public static Connection getDBConn() throws SQLException{
		// TODO Auto-generated method stub
		System.out.println("CALLED - CLASS: DBConnection METHOD: getDBConn()");
		
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String DB_USER = "hr";
			String DB_PASSWORD = "hr";
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}

}
>>>>>>> 3d7f0d00237b3cbfd5e754bbf7676b2b0da9e90c

package dealim.cs.siren;

import java.sql.Connection;
import java.sql.DriverManager;
import org.junit.Test;

public class DB_Test {
	@Test
	public void test() throws Exception {
	    Class.forName("org.mariadb.jdbc.Driver"); // ������DB
	    // Class.forName("com.mysql.jdbc.Driver"); MySQL

	    Connection con = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/siren","root", "201530231");// ������DB siren db ����
	    // Connection con =     DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db�̸�","root","passwd"); MySQL
	    System.out.println(con);
	    }
}


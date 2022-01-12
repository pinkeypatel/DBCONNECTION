package datac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	public void databaseConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/charudb1","root","$Pinkey9004");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from employee;");
		// 5 rows and 3 columns
		while(rs.next()) {
			System.out.print(rs.getString("ID") + "  ");
			System.out.print(rs.getString("NAME") + "  ");
			System.out.println(rs.getString("SALARY"));
		}
	}

}

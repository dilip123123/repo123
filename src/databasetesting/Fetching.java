package databasetesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Fetching {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection
		("jdbc:mysql://localhost:3306/hospital","root","");
		   Statement stmt=con.createStatement();
//ResultSet rs=stmt.executeQuery("Select * from employee where esal=(select max(esal) from employee)");
ResultSet rs=stmt.executeQuery("Select * from employee where esal=(select max(esal) from employee where esal <(select max(esal) from employee))");
		   while(rs.next())
		   {
			   //System.out.println("max sal is:::"+rs.getInt("esal"));
			   System.out.println("second sal is:::"+rs.getInt("esal"));
		   		   }
	}

}

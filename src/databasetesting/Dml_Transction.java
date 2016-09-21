package databasetesting;
import java.sql.*;

public class Dml_Transction {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//loading jdbc drivers
		Class.forName("com.mysql.jdbc.Driver");
		//connecting to hospital database 
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
//creating statement class
		Statement stm=con.createStatement();
		//insert record
		//stm.executeUpdate("insert into employee values('selenium',205,20000)");
		//update record
		stm.executeUpdate("UPDATE employee SET ename='john' WHERE ename='selenium'");
  //delete record
		stm.execute("Delete FROM employee  WHERE ename='john'");
	}

}

package databasetesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Fetching_TableRecords {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//for mysql
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection
		("jdbc:mysql://localhost:3306/hospital","root","");
		   Statement stmt=con.createStatement();
		//To Fetch the records from table
		  //ResultSet rs=stmt.executeQuery("select * from employee");
		   ResultSet rs=stmt.executeQuery("select ename, eno from employee");
		  		  while(rs.next())
		  {
System.out.println(rs.getString(1)+"   "+rs.getInt(2));		  			 
		//  System.out.print(" "+rs.getString("ename")+":::");
		 //   System.out.print(rs.getInt("eno")+":::");
		 // System.out.print(rs.getInt("esal"));
		 // System.out.println("=================");
		  }
		  		}

	}



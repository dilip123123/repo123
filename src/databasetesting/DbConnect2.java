package databasetesting;
import java.sql.*;
import java.util.Scanner;
public class DbConnect2
{
public static void main(String args[])throws Exception
{
	for(int j=1;j<=10;j++){
	Scanner d=new Scanner(System.in);
	System.out.println("enter ename");
	String e=d.next();
	System.out.println("enter eno");
	int ei=d.nextInt();
	System.out.println("enter esalary");
	int s=d.nextInt();
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
   Statement stmt=con.createStatement();
  //To Insert Records
stmt.executeUpdate("insert into employee values('"+e+"',"+ei+","+s+")");

}
}
}

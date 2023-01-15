package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Select_Record {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch438","root","root");
    Statement st=con.createStatement();
	String sql="SELECT id , name,  age, location FROM employee";
	ResultSet rs=st.executeQuery(sql);
	while(rs.next()){
		int id=rs.getInt(1);
		String name=rs.getString(2);
		int age=rs.getInt(3);
		String location=rs.getString(4);
		System.out.println("Id= "+id);
		System.out.println("Name= "+name);
		System.out.println("Age="+age);
		System.out.println("Location="+location);
		System.out.println("*********************");
	}

	}

}

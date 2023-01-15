package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class SqlConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	try{	
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("1");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch438","root","root");
	System.out.println("connected");
	}catch(Exception e){
	System.out.println("Error to connect mySql");
		
	}
	
	
	
	}

}

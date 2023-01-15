
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update_Record {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Statement st=null;
	try{	Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/batch438","root","root");
	
		Statement stm=con.createStatement();
		 String sql="Update employee set age=25 where id in (13,14)";
		 stm.executeUpdate(sql);
		 sql="select id,name,age,location from employee";
		 
	ResultSet rs=stm.executeQuery(sql);
	
	while(rs.next()){
		int id=rs.getInt("id");
	}
		 
	}catch(Exception e){
		e.printStackTrace();
		
	}
	}
    }


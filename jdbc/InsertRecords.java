package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class InsertRecords {

	public static void main(String[] args) throws ClassNotFoundException {
		Statement stm=null;
		
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch438","root","root");
		stm=con.createStatement();
		String sql="insert into employee Values(1,'swapnil',24,'nagpur')";
		stm.executeUpdate(sql);
		System.out.println("successful");
		String sql1="insert into employee Values(2,'swapnil',24,'nagpur')";
		stm.executeUpdate(sql1);
		System.out.println( "dada inserted");
		
		}catch(Exception e){
			e.printStackTrace();
			
			
		}
	}

}

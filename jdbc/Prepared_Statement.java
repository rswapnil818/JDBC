package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Scanner;

public class Prepared_Statement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Prepared statement use for dynamic data insertion.
		
		
		//program for insert data.
		
	/*	Class.forName("com.mysql.jdbc.Driver");
		
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch438","root","root");
        
     String sql="insert into employee Values(?,?,?,?)";
     
        
        PreparedStatement pm=con.prepareStatement(sql);
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter id,name,age,location");
        pm.setInt(1, sc.nextInt());
        pm.setString(2, sc.next());
        pm.setInt(3, sc.nextInt());
        pm.setString(4, sc.next());
        
        pm.executeUpdate();
        System.out.println("data inserted");
        */
        
        
        //program for select data.
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection com=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch438","root","root");
        
        String sql1="select * from employee where location=?";
        
        PreparedStatement pm1=com.prepareStatement(sql1);
        //Scanner Sr=new Scanner(System.in);
       // System.out.println("enter lock");
     //   String location=sc.next();
       
        pm1.setString(1,"nagpur");
        
        ResultSet rs1=pm1.executeQuery();
        		
        		while(rs1.next()){
        			
        			int id=rs1.getInt(1);
        			String name=rs1.getString(2);
        			int age=rs1.getInt(3);
        			String location=rs1.getString(4);
        			
        			System.out.println("id="+id+" name="+name+" age="+age+" location="+location);
        			
        		}
        
        
        
        
        
        
        
        
        
        
	}

}

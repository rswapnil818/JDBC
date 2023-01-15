package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class StatmentEx {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		System.out.println("connected");
		
		
	}
	
}




/*  **JDBC**
 * JDBC= Java database connectivity
 *  
 *  Que. What is database
 *  = Database use to store data in the form of Tables.
 *  
 *     **MySql**
 *  SQL= Structured Query Language.
 *  
 *  3 tyes of SQL
 *  
 *  1. Data defination language
 *    -Create database
 *    -Create Tables
 *    
 *  2.Data Manipulation Language
 *    -insert
 *    -update
 *    -delete
 *    
 *  3.Date Control Language
 *    -rollback (use to restore delete data)
 * **********************************************
 * 
 *    Database=Schema
 *    
 *    Que.How to create Schema.
 *       -in sql >right corner>Schemata>right click on blank Space>there is option of 1.create new schema, create new table,3.create new view 4.create new product /function..>select create new Schema
 * 
 *                                                                                                                                                                            created Schema>right click on it >select create new table>and gives parameters.
 * 
 * 
 * 
 * 
 *  Queries:
 *  
 *  1.insert
 *  
 *  -insert into>schema name> values();
 *  like- insert into student values (1,'swapnil',23)
 * 
 * 
 * 
 * 
 * 
 * **HOW TO CONNECT DATA BASE INTO JAVA
 * step 1.
 * **loading of Driver Class
 *   -Class.forName("com.mysql.jdbc.Driver");
 *   -if this class is not found then throw the exception.
 *   **Class.forName("com.mysql.jdbc.Driver");
 *   beacuse ye class mysql ka hai. is liye is class ko hume import krna hoga.
 *   **How to import class
 *   -right click on class >import>build path>configure build path.
 *   -Class.forName("com.mysql.jdbc.Driver");-right click on this line>libraries>add external JARs>then search in folder where the Mysql file are store>file name(mysql-connector-java)>apply>apply and close.
 *   (if class is add then it shows in project explorer>project>reference libraries.
 * 
 * step 2.
 * **connection
 * 
 * Connection con=DriverManager.getConnection("url://localhost:3306/schema name/table name","user name","password");
 * 
 * Exceptions
 * 1.wrong database=incorrect database name
 * 2.wrong username=access denied for user 
 * 3.wrong password=Access denied for user 'root'@'localhost'(using password:Yes)
 * 4.wrong portname=Communication link failure
 * 
 * step 3.
 * **Statement(use for execute queries)
 * 
 *   Statement stm=con.createStatement();  is like a memory 
 *   
 *   step 4.
 *   insert query
 *     String s="insert into Schema name Values(parameter)";  ----for insert data
 *     
 *     stm.executeUpdate(s);  //return Result
 *     
 *  step 5.
 *     Select query
 *     String s1="select * from table_name";
 *     
 *  step 6.
 *     result
 *     ResultSet rs=stm.executeQuery(s1);
 *     
 *     step 7.
 *     
 *     while(rs.next())  //to check row
 *     {
 *     int id=rs.getInt(1);----- sql ke table me column 1 ko call jayega.
 *     String name=rs.getString(2);---sql ke table me column 2 ko call jayega.
 *     System.out.println("id="+id+"Name="+name
 *     
 *     }
 *     
 *     
 *     

 * */
 
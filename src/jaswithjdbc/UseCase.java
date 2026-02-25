package jaswithjdbc;

import java.sql.*;
public class UseCase {

 public static void main(String[] args)
 {
  
 try {
  
 Class.forName("com.mysql.cj.jdbc.Driver"); 
     
 Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jaswith", "root", "1234");
  
 CallableStatement cs=con.prepareCall( " {CALL getAllEmployees()}");
  
 ResultSet rs=cs.executeQuery();
  
 while (rs.next())   
 {
  System.out.println(rs.getInt("Employee_ID") + " " + rs.getString("First_Name"));
 }
 con.close();
 }
 catch (Exception e)
    {
   System.out.println(e);
    }
 }
 }
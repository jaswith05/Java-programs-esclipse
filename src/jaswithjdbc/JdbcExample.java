package jaswithjdbc;

import java.sql.*;

public class JdbcExample {
 
public static void main(String[] args)
{
	
try {
	
Class.forName("com.mysql.cj.jdbc.Driver"); // is a static method of the Class class used to load a class dynamically at runtime.
	   
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jaswith", "root", "1234");
 
Statement stmt=con.createStatement();

//String creatTable = "create table students1("+"stud_id int primary key, "+"stud_name varchar(20), "+"class int)";

//stmt.executeUpdate(creatTable);
//System.out.println("Table created successfully!");

String insertValues="insert into students1 values(1,'jaswith',9)";
String insertValues2="insert into  students1 values(2,'jashu',10)";
stmt.executeUpdate(insertValues);
stmt.executeUpdate(insertValues2);


ResultSet rs=stmt.executeQuery(" select * from students1");


ResultSetMetaData meta =rs.getMetaData();
int columnCount =meta.getColumnCount();

for(int i=1; i<=columnCount; i++) {
	System.out.print(meta.getColumnName(i)+" | ");
}
System.out.println();


while (rs.next())
{
	/*System.out.println(rs.getInt("Employee_ID") + " " + rs.getString("First_Name")
	+" "+ rs.getString("Last_name")+" "+rs.getString("Gender")+" "+ rs.getInt("age")
	+" "+ rs.getString("Address")+" "+rs.getInt("mobile_number")+" "+rs.getString("dept")+
	" "+ rs.getInt("salary"));*/
	for (int i=1; i<=columnCount;i++) {
		System.out.print(rs.getObject(i)+" | ");
	}
	System.out.println();
	
}
con.close();
}
	catch (Exception e)
   {
		System.out.println(e);
   }
}
 
}
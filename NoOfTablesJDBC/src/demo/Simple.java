package demo;
import java.sql.*;  
class Dbmd2{  
public static void main(String args[]){  
try{  
Class.forName("org.gjt.mm.mysql.Driver");  
  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3333/world","root","root");  
  
DatabaseMetaData dbmd=con.getMetaData();  
String table[]={"TABLE"};  
ResultSet rs=dbmd.getTables(null,null,null,table);  
  
while(rs.next()){  
System.out.println(rs.getString(3));  
}  
  
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  
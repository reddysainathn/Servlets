package src.g;
import javax.servlet.*;
import java.sql.*;

public class MyListener implements ServletContextListener{

	public void contextInitialized(ServletContextEvent arg0) {
		int status=0;
		Connection con=null;
	
      try{
		con=GetCon.getCon();
		PreparedStatement ps1=con.prepareStatement("Select * from NEWACCOUNT");
		

      try{
		status=ps1.executeUpdate();
		}

      catch(Exception e)
		{e.printStackTrace();
		 status=2;
		 System.out.println("my staus is1111111"+status);
		 }		
		
       if(status==0)
		{System.out.println("your table name already exist"+status);}
		
         
       else if(status==2) 
		
        {System.out.println("else if part table does not exist new table has created"+status);
		PreparedStatement ps3=con.prepareStatement("CREATE SEQUENCE javatpointnewaccount MINVALUE 1 MAXVALUE 999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  NOORDER  NOCYCLE");
		ps3.executeUpdate();
		
		PreparedStatement ps=con.prepareStatement("CREATE TABLE `NEWACCOUNT` (`ACCOUNTNO` int(11) NOT NULL ,`USERNAME` VARCHAR(45) NOT NULL DEFAULT '',`PASSWORD` VARCHAR(45) NOT NULL DEFAULT '',`REPASSWORD` VARCHAR(45) NOT NULL DEFAULT '', `AMOUNT` int(11) NOT NULL DEFAULT '0',`ADDERESS` VARCHAR(45) NOT NULL DEFAULT '',`PHONE` int(11) NOT NULL ,PRIMARY KEY (`ACCOUNTNO`))");
		ps.executeUpdate();
		
		
		
	
		}
		
		
		else{System.out.println("else part "+status);
		}}
	    catch(Exception e){e.printStackTrace();}
	    }
	    public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("project undeployed");
		
	}
}

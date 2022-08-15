package timeconversion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Connenction {
       Connection c;
       Statement s;
       public Connenction() {
    	   try {
    		   Class.forName("com.mysql.jdbc.Driver");
               c=DriverManager.getConnection("jdbc:mysql://project","root","");
    	       s=c.createStatement();
    	   }
    	   catch(Exception e) {
    		   System.out.println(e);
    	   }
       }
}
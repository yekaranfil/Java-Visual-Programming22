package javaodev6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class baglantiodev {
	
	
	static Connection myConn;
	static Statement myStat;
	
	static ResultSet yap(String sql_sorgu) {
		
		ResultSet myRs = null;
		try {			
			myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/odev61","root","1234");
			myStat = (Statement) myConn.createStatement();
			System.out.println("baðlantý kuruldu");
			myRs = myStat.executeQuery(sql_sorgu);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return myRs;
	}

}

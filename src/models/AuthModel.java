package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class AuthModel {
	public AuthModel(){	
		
	}
	
	public boolean login(String username, String password) {
		boolean flag = false;
		
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}  
			Connection con = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_db_test_login","freedb_sebastian","P$wu7*v%YnSCby3");  
			Statement stmt=con.createStatement();  
			ResultSet rs= stmt.executeQuery("SELECT * FROM (table_test)");
			while(rs.next()) {
				if(rs.getString(1).equals(username) && rs.getString(2).equals(password)) {
					flag = true;
				}
			}
			con.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
		return flag;
	}
}

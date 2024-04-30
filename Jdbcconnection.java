package com.chaninsys.Collection;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Jdbcconnection {


	
	
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
		    Connection connection = getConnection();
		    System.out.println(connection);
//		    insert();
		}
		public static Connection getConnection() throws ClassNotFoundException, SQLException {
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Jay@0917");
		    return connection;

	        
	    }
	

}

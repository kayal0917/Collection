package com.chaninsys.Collection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentImplement {
//	private static final Statement ConnectionUtil = null;
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
        StudentImplement studentImplement = new StudentImplement();
        Student student1 = new Student (102,"ash","Chennai");
//        StudentImplement.insert();
        StudentImplement.update();
    }
//     public void insertStudent() throws ClassNotFoundException, SQLException{
//         Connection connection = ConnectionUtil.getConnection();
//         System.out.println(connection);
//         String save="insert into student (id,name, address) values (102,'ash', 'chennai')";
//         PreparedStatement prepareStatement = connection.prepareStatement(save);
//         int rows = prepareStatement.executeUpdate();
//         System.out.println(rows+" inserted");
//     }
// 	public static void	insert() throws SQLException, ClassNotFoundException{
//	    Connection connection = Jdbcconnection.getConnection();
//	    System.out.println(connection);
//	    String query="INSERT INTO student VALUES (102,'krish','chennai')";
//        PreparedStatement prepareStatement = connection.prepareStatement(query);
//	   int rows= prepareStatement.executeUpdate();
//        System.out.println("inserted"+ rows);
 	//}
 	public static void	update() throws SQLException, ClassNotFoundException{
	    Connection connection = Jdbcconnection.getConnection();
	    System.out.println(connection);
	    String query="update student name='ash' where id=102";
        PreparedStatement prepareStatement = connection.prepareStatement(query);
	   int rows= prepareStatement.executeUpdate();
        System.out.println("update"+ rows);	 
 	
		

 	}
	}



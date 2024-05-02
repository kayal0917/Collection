package com.chsinsys.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.chaninsys.List.Userconnection;
public class User {

	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		insert();

		Userjdbc user1 = new Userjdbc(102, "ash", "Chennai");
	}

	public static void insert() throws SQLException, ClassNotFoundException {
		Connection connection = Userconnection.getConnection();
		System.out.println(connection);
		String query = "INSERT INTO productusers VALUES (102,'krish','chennai')";
		PreparedStatement prepareStatement = connection.prepareStatement(query);
		int rows = prepareStatement.executeUpdate();
		System.out.println("inserted" + rows);
	}
}

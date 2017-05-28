package com.dao.UserDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.User;
import com.util.ConnectionUtil;

public class UserDao {
	static Connection connection;

	// Add new User
	public static void newUser() throws SQLException {
		connection = ConnectionUtil.getConnection();
		String query = "INSERT INTO `revature`.`user` (`id`, `name`, `username`, `password`, `mobile_no`, `email_ID`, `active`, `role_id`) VALUES (?,?,?,?,?,?,?,?)";
		PreparedStatement pst = connection.prepareStatement(query);

		pst.setInt(1, User.getId());
		pst.setString(2, User.getName());
		pst.setString(3, User.getUsername());
		pst.setString(4, User.getPassword());
		pst.setLong(5, User.getMobile_no());
		pst.setString(6, User.getEmail_ID());
		pst.setString(7, User.getActive());
		pst.setInt(8, User.getRole_id());

		int rows = pst.executeUpdate();
		System.out.println("No of rows inserted : " + rows);
		// close DB resources
		ConnectionUtil.close(connection, pst, null);
	}

	// Login User
	public static void loginUser() throws SQLException {
		connection = ConnectionUtil.getConnection();
		String query = "UPDATE user SET active = 'A' where (userName= ?) AND (password = ?)";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setString(1, User.getUsername());
		pst.setString(2, User.getPassword());
		pst.executeUpdate();
		System.out.println("Login Sucess");
		// close DB resources
		ConnectionUtil.close(connection, pst, null);
	}

	// Reset Password
	public static void resetPassword(String newPassword) throws SQLException {
		connection = ConnectionUtil.getConnection();
		String query = "UPDATE user SET password = ? WHERE ((username = ?) AND (active = 'A')) AND password=?";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setString(1, newPassword);
		pst.setString(2, User.getUsername());
		pst.setString(3, User.getPassword());
		int rows = pst.executeUpdate();
		if (rows == 1) {
			System.out.println("Password Reset Sucess");
		} else if (rows == 0) {
			System.out.println("Please Login to reset");
		} else {
			System.out.println("Error Reset");
		}
		// close DB resources
		ConnectionUtil.close(connection, pst, null);
	}
}

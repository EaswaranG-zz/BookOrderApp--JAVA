package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionUtil {
	// get connection to db
	private static final String DRIVERNAME = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/revature";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "easwaran";
	static Connection connection = null;

	public static Connection getConnection() {
		try {
			Class.forName(DRIVERNAME);

			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("DB Connection Success");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return connection;
	}

	public static void close(Connection conn, Statement stmt, ResultSet rs) {

		try {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {

		}

	}
}

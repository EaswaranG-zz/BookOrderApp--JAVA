package com.dao.BookSalesDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.util.ConnectionUtil;

public class BookSalesDao {
	static Connection connection;

	// #1.Author can able to view- how many books sold weekly
	public static void salesWeekly(String min, String max) throws SQLException {
		connection = ConnectionUtil.getConnection();
		String query = "select book_id,order_date from book_sales where (order_date <=? AND order_date >= ?)";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setString(1, min);
		pst.setString(2, max);
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			int book_id = rs.getInt("book_id");
			String order_date = rs.getString("order_date");
			System.out.println("Book_id: " + book_id);
			System.out.println("order_date: " + order_date);
			System.out.println();
		}
		ConnectionUtil.close(connection, pst, null);
	}

	// #2.Author can able to view- how many books sold monthly
	public static void salesMonthly(String min, String max) throws SQLException {
		connection = ConnectionUtil.getConnection();
		String query = "select book_id,order_date from book_sales where (order_date <=? AND order_date >= ?)";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setString(1, min);
		pst.setString(2, max);
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			int book_id = rs.getInt("book_id");
			String order_date = rs.getString("order_date");
			System.out.println("Book_id: " + book_id);
			System.out.println("order_date: " + order_date);
			System.out.println();
		}
		ConnectionUtil.close(connection, pst, null);
	}

	// #3.Author can able to view- how many books sold yearly

	public static void salesYearly(String min, String max) throws SQLException {
		connection = ConnectionUtil.getConnection();
		String query = "select book_id,order_date from book_sales where (order_date <=? AND order_date >= ?)";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setString(1, min);
		pst.setString(2, max);
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			int book_id = rs.getInt("book_id");
			String order_date = rs.getString("order_date");
			System.out.println("Book_id: " + book_id);
			System.out.println("order_date: " + order_date);
			System.out.println();
		}
		ConnectionUtil.close(connection, pst, null);
	}
}

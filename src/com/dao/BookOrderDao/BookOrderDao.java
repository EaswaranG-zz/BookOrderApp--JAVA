package com.dao.BookOrderDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.model.Book_Sales;
import com.util.ConnectionUtil;

public class BookOrderDao {
	static Connection connection;

	// #1.User can able to view the available books and place an order
	public static void viewAvailableBooks() throws SQLException {
		connection = ConnectionUtil.getConnection();
		Scanner scan = new Scanner(System.in);
		String query = "select isbn,title,author,price from book where status = 'published'";
		PreparedStatement pst = connection.prepareStatement(query);
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			int isbn = rs.getInt("isbn");
			String title = rs.getString("title");
			String author = rs.getString("author");
			int price = rs.getInt("price");
			System.out.println("Isbn:" + isbn);
			System.out.println("Title:" + title);
			System.out.println("Author:" + author);
			System.out.println("Price:" + price);
			System.out.println();
		}
		System.out.println("Enter an ISBN to place the order");
		int input = scan.nextInt();
		String insertQuery = "INSERT INTO `revature`.`book_sales` (`sales_id`, `user_id`, book_id, `qty`, `total_amount`, `order_date`, `status`) VALUES (1123, 155,"
				+ input + ", 1, 500, '2016-07-16', 'IN PROGRESS')";
		PreparedStatement pst1 = connection.prepareStatement(insertQuery);

		int row = pst1.executeUpdate(insertQuery);
		System.out.println(row + " book ordered");
		ConnectionUtil.close(connection, pst, null);
		ConnectionUtil.close(connection, pst1, null);
		scan.close();
	}

	// #2.User can select the quantity of books
	public static void selectQuantity() throws SQLException {
		connection = ConnectionUtil.getConnection();
		String query = "update book_sales set qty=? where sales_id=? and user_id=?";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setInt(1, Book_Sales.getQty());
		pst.setInt(2, Book_Sales.getSalesID());
		pst.setInt(3, Book_Sales.getUserID());
		int row = pst.executeUpdate();
		System.out.println(row + " book content updated.");
		// close DB resources
		ConnectionUtil.close(connection, pst, null);
	}

	// #3.User can cancel the book order
	public static void cancelOrder() throws SQLException {
		connection = ConnectionUtil.getConnection();
		String query = "update book_sales set status='CANCELLED' where sales_id=? and user_id=?";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setInt(1, Book_Sales.getSalesID());
		pst.setInt(2, Book_Sales.getUserID());
		int row = pst.executeUpdate();
		System.out.println(row + " book order updated.");
		// close DB resources
		ConnectionUtil.close(connection, pst, null);

	}

}

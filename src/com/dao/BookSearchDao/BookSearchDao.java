package com.dao.BookSearchDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Book;
import com.util.ConnectionUtil;

public class BookSearchDao {
	static Connection connection;

	// #1.List all books
	public static void ViewAllBooks() throws SQLException {
		connection = ConnectionUtil.getConnection();
		String query = "select isbn,title,author from book";
		PreparedStatement pst = connection.prepareStatement(query);

		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			int isbn = rs.getInt("isbn");
			String title = rs.getString("title");
			String author = rs.getString("author");
			System.out.println("Isbn: " + isbn);
			System.out.println("Title: " + title);
			System.out.println("author: " + author);
			System.out.println();
		}
		ConnectionUtil.close(connection, pst, null);
	}

	// #2.search by title
	public static void searchByTitle() throws SQLException {
		connection = ConnectionUtil.getConnection();
		String query = "select isbn,title,author from book where title=?";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setString(1, Book.getTitle());
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			int isbn = rs.getInt("isbn");
			String title = rs.getString("title");
			String author = rs.getString("author");
			System.out.println("Isbn: " + isbn);
			System.out.println("Title: " + title);
			System.out.println("author: " + author);
			System.out.println();
		}
		ConnectionUtil.close(connection, pst, null);
	}

	// #3.Search by author name
	public static void searchByAuthor() throws SQLException {
		connection = ConnectionUtil.getConnection();
		String query = "select isbn,title,author from book where author=?";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setString(1, Book.getAuthor());
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			int isbn = rs.getInt("isbn");
			String title = rs.getString("title");
			String author = rs.getString("author");
			System.out.println("Isbn: " + isbn);
			System.out.println("Title: " + title);
			System.out.println("author: " + author);
			System.out.println();
		}
		ConnectionUtil.close(connection, pst, null);
	}

	// #4.Search by price range
	public static void searchByPrice(int min, int max) throws SQLException {
		connection = ConnectionUtil.getConnection();
		String query = "select isbn,title,author,price from book where price between ? and ?";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setInt(1, min);
		pst.setInt(2, max);
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			int isbn = rs.getInt("isbn");
			String title = rs.getString("title");
			String author = rs.getString("author");
			int price = rs.getInt("price");
			System.out.println("Isbn: " + isbn);
			System.out.println("Title: " + title);
			System.out.println("Author: " + author);
			System.out.println("Price: " + price);
			System.out.println();
		}
		ConnectionUtil.close(connection, pst, null);
	}

	// #5.Search by ISBN
	public static void searchByIsbn() throws SQLException {
		connection = ConnectionUtil.getConnection();
		String query = "select isbn,title,author,price from book where isbn=?";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setInt(1, Book.getIsbn());
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			int isbn = rs.getInt("isbn");
			String title = rs.getString("title");
			String author = rs.getString("author");
			int price = rs.getInt("price");
			System.out.println("Isbn: " + isbn);
			System.out.println("Title: " + title);
			System.out.println("author: " + author);
			System.out.println("Price: " + price);
			System.out.println();
		}
		ConnectionUtil.close(connection, pst, null);
	}

}

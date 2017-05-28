package com.dao.AuthorDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Book;
import com.util.ConnectionUtil;

public class AuthorDao {
	static Connection connection;
	// Book book;

	// Create a book
	public static void createBook() throws SQLException {
		connection = ConnectionUtil.getConnection();
		String query = "INSERT INTO `revature`.`book` (`isbn`, `title`, `author`, `publishDate`, `content`, `price`, `status`) VALUES (?,?,?,?,?,?,?)";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setInt(1, Book.getIsbn());
		pst.setString(2, Book.getTitle());
		pst.setString(3, Book.getAuthor());
		pst.setString(4, Book.getPublishDate());
		pst.setString(5, Book.getContent());
		pst.setInt(6, Book.getPrice());
		pst.setString(7, Book.getStatus());

		int row = pst.executeUpdate();
		System.out.println(row + " book created.");
		// close DB resources
		ConnectionUtil.close(connection, pst, null);

	}

	// #2.Author can upload the contents of book
	public static void uploadContent() throws SQLException {
		connection = ConnectionUtil.getConnection();
		String query = "UPDATE `revature`.`book` SET `content`=? WHERE `isbn`=?";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setString(1, Book.getContent());
		pst.setInt(2, Book.getIsbn());
		int row = pst.executeUpdate();
		System.out.println(row + " book content updated.");
		// close DB resources
		ConnectionUtil.close(connection, pst, null);
	}

	// #3.Author can view the book and contents
	public static void viewBookAndStatus() throws SQLException {
		connection = ConnectionUtil.getConnection();
		String query = "SELECT title,content FROM book where (isbn = ?) ";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setInt(1, Book.getIsbn());
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			String title = rs.getString("title");
			String content = rs.getString("content");
			System.out.println("Title:" + title);
			System.out.println("Content:" + content);
			System.out.println();
		}
		ConnectionUtil.close(connection, pst, null);
	}

	// #4.Author can delete the book
	public static void deleteBook() throws SQLException {
		connection = ConnectionUtil.getConnection();
		String query = "delete from book where isbn = ?";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setInt(1, Book.getIsbn());
		int row = pst.executeUpdate();
		System.out.println(row + " book deleted.");
		// close DB resources
		ConnectionUtil.close(connection, pst, null);
	}

	// #5.Author can view all his books
	public static void viewAllBooks() throws SQLException {
		connection = ConnectionUtil.getConnection();
		String query = "SELECT title,content from book where author = ?";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setString(1, Book.getAuthor());
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			String title = rs.getString("title");
			String content = rs.getString("content");
			System.out.println("Title:" + title);
			System.out.println("Content:" + content);
			System.out.println();
		}
		ConnectionUtil.close(connection, pst, null);

	}

}

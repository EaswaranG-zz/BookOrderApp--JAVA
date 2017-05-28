package com.dao.RatingDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Book_Ratings;
import com.util.ConnectionUtil;

public class RatingDao {
	static Connection connection;

	// Add Rating
	public static void addRating(int bookId, int rating) throws SQLException {
		connection = ConnectionUtil.getConnection();
		String query = "update book_ratings set rating=? where book_id=?";
		PreparedStatement pst = connection.prepareStatement(query);

		pst.setInt(1, Book_Ratings.getRating());
		pst.setInt(2, Book_Ratings.getBookID());

		int rows = pst.executeUpdate();
		System.out.println("No of rows updated : " + rows);

		// close DB resources
		ConnectionUtil.close(connection, pst, null);

	}
}

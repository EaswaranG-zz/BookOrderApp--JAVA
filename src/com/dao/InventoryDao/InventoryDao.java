package com.dao.InventoryDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Book_Inventory;
import com.model.Book_Sales;
import com.util.ConnectionUtil;

public class InventoryDao {
	static Connection connection;

	// #1.Admin can increase the quantity of the book
	public static void increaseQty() throws SQLException {
		connection = ConnectionUtil.getConnection();
		String query = "update book_inventory set qty = ? where id = ?";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setInt(1, Book_Inventory.getQty());
		pst.setInt(2, Book_Inventory.getId());
		int row = pst.executeUpdate();
		System.out.println(row + " book quantity updated.");
		// close DB resources
		ConnectionUtil.close(connection, pst, null);

	}

	// #2.Once the stock is not available, user should not be able to place an
	// order
	public static void OutOfStock() throws SQLException {
		connection = ConnectionUtil.getConnection();
		String query = "update book_sales set status='Out of stock' where ((select qty from book_inventory where id = ?) > 0) AND user_id=?";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setInt(1, Book_Inventory.getId());
		pst.setInt(2, Book_Sales.getUserID());
		int row = pst.executeUpdate();
		System.out.println(row + " book is OUT OF STOCK");
		try {
			throw new Exception("OUT OF STOCK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// close DB resources
		ConnectionUtil.close(connection, pst, null);
	}
}

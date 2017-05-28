package com.test;

import java.sql.SQLException;

import com.dao.BookSalesDao.BookSalesDao;
import com.dao.BookSearchDao.BookSearchDao;
import com.model.Book;
import com.model.Book_Sales;

public class BookApp {
	public static void main(String[] args) throws SQLException {
		// ConnectionUtil.getConnection();
		// RatingDao.addRating(1245,3);

		// UserDao.newUser(209,"sathish","kumar","sathis123",243815845,"sat@gmail.com","I",400);
		// UserDao.loginUser("cms", "cms123");
		// UserDao.resetPassword("cms", "cms123", "124cms");

		// BookDAO ESSENTIALS
		/*
		 * Book book = new Book(); book.setIsbn(1025);
		 * book.setTitle("Half GirlFriend"); book.setAuthor("cheatan bhagat");
		 * 
		 * book.setPublishDate("2015-04-11");
		 * book.setContent("Riya somani is a rich girl in mumbai.");
		 * book.setPrice(200); book.setStatus("published");
		 * 
		 * AuthorDao.createBook();
		 */

		// Add book essentials
		/*
		 * Book book = new Book(); book.setIsbn(1007);
		 * book.setTitle("Life is what u live");
		 * book.setAuthor("Preethy shenoy"); book.setPublishDate("2016-02-05");
		 * book.setContent("Preethi went to mental treatment.");
		 * book.setPrice(200); book.setStatus("published");
		 * 
		 * AuthorDao.createBook();
		 */

		// Update Content Essentials
		/*
		 * Book book = new Book(); book.setIsbn(1025);
		 * book.setContent("Riya somani is a rich girl but madhav is poor");
		 * AuthorDao.uploadContent();
		 */
		/*
		 * //Delete book Essentials Book book = new Book(); book.setIsbn(1025);
		 * AuthorDao.deleteBook();
		 */

		/*
		 * //View All Book essentials Book book = new Book();
		 * book.setAuthor("cheatan bhagat"); AuthorDao.viewAllBooks();
		 */
		/*
		 * Book order essentials Book book = new Book();
		 * BookOrderDao.viewAvailableBooks();
		 */
		/*
		 * Book_Sales book = new Book_Sales(); //book.setQty(35);
		 * book.setUserID(151); book.setSalesID(1112);
		 * BookOrderDao.cancelOrder();
		 */
		/*
		 * Book_Inventory book = new Book_Inventory(); book.setId(1245);
		 * book.setQty(58); InventoryDao.increaseQty();
		 */
		/*
		 * Book_Sales b = new Book_Sales(); Book_Inventory b1 = new
		 * Book_Inventory(); b.setUserID(154); b1.setId(10202);
		 * InventoryDao.OutOfStock();
		 */
		/*
		 * Book book = new Book(); book.setIsbn(10202);
		 * BookSearchDao.searchByIsbn();
		 */
		/* BookSalesDao.salesYearly("2017-01-07", "2017-01-01"); */

	}
}

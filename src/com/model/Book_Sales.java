package com.model;

public class Book_Sales {
	private static int salesID;
	private static int userID;
	private static int bookID;
	private static int qty;
	private static int totalAmount;
	private static String orderDate;
	private static String status;

	public static int getSalesID() {
		return salesID;
	}

	public void setSalesID(int salesID) {
		Book_Sales.salesID = salesID;
	}

	public static int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		Book_Sales.userID = userID;
	}

	public static int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		Book_Sales.bookID = bookID;
	}

	public static int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		Book_Sales.qty = qty;
	}

	public static int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		Book_Sales.totalAmount = totalAmount;
	}

	public static String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		Book_Sales.orderDate = orderDate;
	}

	public static String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		Book_Sales.status = status;
	}
}

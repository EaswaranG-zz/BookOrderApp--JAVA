package com.model;

public class Book_Ratings {
	private static int userID;
	private static int bookID;
	private static int rating;

	public static int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		Book_Ratings.userID = userID;
	}

	public static int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		Book_Ratings.bookID = bookID;
	}

	public static int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		Book_Ratings.rating = rating;
	}
}

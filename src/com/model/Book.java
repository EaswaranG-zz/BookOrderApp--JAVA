package com.model;

public class Book {
	public static int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		Book.isbn = isbn;
	}

	public static String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		Book.title = title;
	}

	public static String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		Book.author = author;
	}

	public static String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String string) {
		Book.publishDate = string;
	}

	public static String getContent() {
		return content;
	}

	public void setContent(String content) {
		Book.content = content;
	}

	public static int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		Book.price = price;
	}

	public static String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		Book.status = status;
	}

	private static int isbn;
	private static String title;
	private static String author;
	private static String publishDate;
	private static String content;
	private static int price;
	private static String status;
}

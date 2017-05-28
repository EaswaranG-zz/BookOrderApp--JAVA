package com.model;

public class Book_Inventory {
	private static int id;
	private static int qty;

	public static int getId() {
		return id;
	}

	public void setId(int id) {
		Book_Inventory.id = id;
	}

	public static int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		Book_Inventory.qty = qty;
	}
}

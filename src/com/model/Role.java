package com.model;

public class Role {
	private static int id;
	private static String name;

	public static int getId() {
		return id;
	}

	public void setId(int id) {
		Role.id = id;
	}

	public static String getName() {
		return name;
	}

	public void setName(String name) {
		Role.name = name;
	}
}

package com.model;

public class User {
	// id,name,username,password,mobile_no,email_ID,active,role_id
	private static int id;

	public static int getId() {
		return id;
	}

	public void setId(int id) {
		User.id = id;
	}

	public static String getName() {
		return name;
	}

	public void setName(String name) {
		User.name = name;
	}

	public static String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		User.username = username;
	}

	public static String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		User.password = password;
	}

	public static long getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(long mobile_no) {
		User.mobile_no = mobile_no;
	}

	public static String getEmail_ID() {
		return email_ID;
	}

	public void setEmail_ID(String email_ID) {
		User.email_ID = email_ID;
	}

	public static String getActive() {
		return active;
	}

	public void setActive(String active) {
		User.active = active;
	}

	public static int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		User.role_id = role_id;
	}

	private static String name;
	private static String username;
	private static String password;
	private static long mobile_no;
	private static String email_ID;
	private static String active;
	private static int role_id;
}

package com.chsinsys.jdbc;

public class Userjdbc {
	static int userid;
	static String username;
	static String address;
	public static int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public static String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public static String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Userjdbc [userid=" + userid + ", username=" + username + ", address=" + address + "]";
	}
	public Userjdbc(int userid, String username, String address) {
		super();
		this.userid = userid;
		this.username = username;
		this.address = address;
	}
	
	


	}



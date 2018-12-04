package com.aasiwariya.pojo;

public class User {
	String userNAme;
	String password;
	String userType;
	public User(String userNAme, String password, String userType) {
		super();
		this.userNAme = userNAme;
		this.password = password;
		this.userType = userType;
		
	}
	public String getUserNAme() {
		return userNAme;
	}
	public String getPassword() {
		return password;
	}
	public String getUserType() {
		return userType;
	
	}
	

}

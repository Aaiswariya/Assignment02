package com.aasiwariya.dao;

import java.util.ArrayList;

import com.aaiswariya.dao.InvalidUserException;
import com.aasiwariya.pojo.User;

public class UserDAO {
ArrayList<User> userList;
public UserDAO() {
	userList= new ArrayList<>();
	userList.add(new User("Onkar" ,"java" , "Admin" ));
	userList.add(new User("ash" ,"sql" , "User" ));
	userList.add(new User("Rahul" ,"java" , "Admin" ));
	
}
public String getUserType(String userName, String Password){
	for (User user :userList) {
		if(user.getUserNAme().equals(userName)&& user.getPassword().equals(Password)) {
			return user.getUserType();
		}}
	throw new InvalidUserException("User Name and Password deosnt exists.....");
	}
}


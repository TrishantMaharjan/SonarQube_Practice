package com.companyname.springprojectdemo.service;

import com.companyname.springprojectdemo.model.Employee;
import com.companyname.springprojectdemo.model.User;

public interface UserService {
	
	void userSignup(User user);
	void updateUser(User user);
	User userLogin(String un, String psw);
	
}

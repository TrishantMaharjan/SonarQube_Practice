package com.companyname.springprojectdemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companyname.springprojectdemo.model.User;
import com.companyname.springprojectdemo.repository.UserRepository;
import com.companyname.springprojectdemo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public void userSignup(User user) {
		userRepo.save(user);
	}

	@Override
	public User userLogin(String un, String psw) {
		
		return userRepo.findByUsernameAndPassword(un, psw);
		
	}

	@Override
	public void updateUser(User user) {
		userRepo.save(user);
		
	}
	
}

package com.companyname.springprojectdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.companyname.springprojectdemo.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findByUsernameAndPassword(String un, String psw);
	
}

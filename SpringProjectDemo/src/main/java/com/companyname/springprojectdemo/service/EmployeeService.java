package com.companyname.springprojectdemo.service;

import java.util.List;

import com.companyname.springprojectdemo.model.Employee;
import com.companyname.springprojectdemo.model.User;

public interface EmployeeService {
	void addEmp(Employee emp);
	void deleteEmp(Long id);
	void updateEmp(Employee emp);
	Employee getById(Long id);
	List<Employee> getAllEmps();
}

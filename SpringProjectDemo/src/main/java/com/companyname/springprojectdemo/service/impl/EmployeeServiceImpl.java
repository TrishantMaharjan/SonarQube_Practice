package com.companyname.springprojectdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companyname.springprojectdemo.model.Employee;
import com.companyname.springprojectdemo.repository.EmployeeRepository;
import com.companyname.springprojectdemo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public void addEmp(Employee emp) {
		empRepo.save(emp);
	}

	@Override
	public void deleteEmp(Long id) {
		empRepo.deleteById(id);
	}

	@Override
	public void updateEmp(Employee emp) {
		empRepo.save(emp);
	}

	@Override
	public Employee getById(Long id) {
		return empRepo.getById(id);
	}

	@Override
	public List<Employee> getAllEmps() {
		return empRepo.findAll();
	}

}

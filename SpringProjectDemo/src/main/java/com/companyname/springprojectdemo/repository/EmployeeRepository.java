package com.companyname.springprojectdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.companyname.springprojectdemo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

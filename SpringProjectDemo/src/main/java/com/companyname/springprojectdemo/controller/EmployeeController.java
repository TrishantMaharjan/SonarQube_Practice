package com.companyname.springprojectdemo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.companyname.springprojectdemo.model.Employee;
import com.companyname.springprojectdemo.model.User;
import com.companyname.springprojectdemo.service.EmployeeService;
import com.companyname.springprojectdemo.service.UserService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/employee")
	public String getEmployeeForm(HttpSession session) {
		if (session.getAttribute("activeuser")==null) {
			return "LoginForm";
		}
		return "EmployeeForm";
	}
	
	@PostMapping("/employee")
	public String saveEmployee(@ModelAttribute Employee employee, HttpSession session) {
		if (session.getAttribute("activeuser")==null) {
			return "LoginForm";
		}
		service.addEmp(employee);
		return "EmployeeForm";
	}
	
	@GetMapping("/list")
	public String getAll(Model model, HttpSession session) {
		if (session.getAttribute("activeuser")==null) {
			return "LoginForm";
		}
		model.addAttribute("elist",service.getAllEmps());
		return "EmployeeList";
	}
	
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam Long id) {
		service.deleteEmp(id);
		return "redirect:/list";
	}
	
	@GetMapping("/edit")
	public String editEmployee(@RequestParam Long id, Model model) {
		model.addAttribute("emodel", service.getById(id));
		return "EditEmployee";
	}
	
	@PostMapping("/update")
	public String updateEmployee(@ModelAttribute Employee employee) {
		service.updateEmp(employee);
		return "redirect:/list";
	}
}

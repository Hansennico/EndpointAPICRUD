package com.hansen.EndpointAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hansen.EndpointAPI.model.Employee;
import com.hansen.EndpointAPI.service.EmployeeServices;

@RestController
@RequestMapping("/api") 
public class EmployeeController {
	@Autowired
	private EmployeeServices employeeService;
	
	@GetMapping("/employee")
	public List<Employee> getAll(){
		return employeeService.getAll();
	}
	
	@GetMapping("/employee/{id}")
	public Employee get(@PathVariable int id) {
		Employee employeeObj = employeeService.get(id);
		if(employeeObj == null) 
			throw new RuntimeException("Employee with ID: "+id+" is not found");
		else
			return employeeService.get(id);
	}
	
	@PostMapping("/employee")
	public Employee create(@RequestBody Employee employeeObj) {
		employeeService.create(employeeObj);
		return employeeObj;
	}
	
	@DeleteMapping("/employee/{id}")
	public String Delete(@PathVariable int id){
		employeeService.delete(id);
		return "Employee with ID: "+id+" has been deleted";
	}
	
	@PutMapping("/employee")
	public Employee Update(@RequestBody Employee employeeObj) {
		employeeService.create(employeeObj);
		return employeeObj;
	}
}

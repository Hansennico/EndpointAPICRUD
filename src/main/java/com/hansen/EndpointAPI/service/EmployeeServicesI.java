package com.hansen.EndpointAPI.service;

import java.util.List;

import com.hansen.EndpointAPI.model.Employee;

public interface EmployeeServicesI {
	List<Employee> getAll();
	Employee get(int id);
	void create(Employee employee);
	void delete(int id);
}

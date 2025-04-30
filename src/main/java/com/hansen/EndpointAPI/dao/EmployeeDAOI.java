package com.hansen.EndpointAPI.dao;

import java.util.List;

import com.hansen.EndpointAPI.model.*;

public interface EmployeeDAOI {
	List<Employee> getAll();
	Employee get(int id);
	void create(Employee employee);
	void delete(int id);
}

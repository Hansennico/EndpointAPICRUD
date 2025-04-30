package com.hansen.EndpointAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hansen.EndpointAPI.dao.EmployeeDAO;
import com.hansen.EndpointAPI.model.Employee;

@Service
public class EmployeeServices implements EmployeeServicesI{
	
	@Autowired
	private EmployeeDAO employeeDao;
	
	@Transactional
	@Override
	public List<Employee> getAll() {
		return employeeDao.getAll();
	}
	
	@Transactional
	@Override
	public Employee get(int id) {
		return employeeDao.get(id);
	}
	
	@Transactional
	@Override
	public void create(Employee employee) {
		employeeDao.create(employee);
		
	}
	
	@Transactional
	@Override
	public void delete(int id) {
		employeeDao.delete(id);
		
	}
}

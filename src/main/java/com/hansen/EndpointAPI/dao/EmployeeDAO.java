package com.hansen.EndpointAPI.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hansen.EndpointAPI.model.Employee;

import jakarta.persistence.EntityManager;

@Repository
public class EmployeeDAO implements EmployeeDAOI{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Employee> getAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Employee> query = currentSession.createQuery("FROM Employee", Employee.class);
		List<Employee> list = query.getResultList();
		return list;
	}

	@Override
	public Employee get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Employee employeeObj = currentSession.get(Employee.class, id);
		return employeeObj;
	}

	@Override
	public void create(Employee employee) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.merge(employee);
		
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Employee employeeObj = currentSession.get(Employee.class, id);
		currentSession.remove(employeeObj);;
		
	}

}

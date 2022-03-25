package com.rest.dao;

import java.util.List;

import com.rest.entity.Employee;

public interface EmployeeDao {
	
	Employee addEmployee(Employee e);
	
	Employee updateEmployee(Employee e);
	
	String deleteEmployee(int eid);
	
	Employee getEmployee(int eid);
	
	List<Employee> getAllEmployee();

}

package com.boot.dao;

import java.util.List;

import com.boot.entity.Employee;

public interface EmployeeDao {
	
	Employee addEmployee(Employee e);
	
	Employee updateEmployee(Employee e);
	
	String deleteEmployee(int eid);
	
	Employee getEmployee(int eid);
	
	List<Employee> getAllEmployee();

}

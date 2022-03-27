package com.data.service;

import java.util.List;
import java.util.Optional;

import com.data.entity.Employee;

public interface EmployeeService {

	Employee addEmployee(Employee e);
	
	Employee updateEmployee(Employee e);
	
	void deleteEmployee(int eid);
	
	Optional<Employee> getEmployee(int eid);
	
	Iterable<Employee> getAllEmployee();
}

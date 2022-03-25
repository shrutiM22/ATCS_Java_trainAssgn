package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rest.dao.EmployeeDao;
import com.rest.entity.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDao dao;

	@Override
	public Employee addEmployee(Employee e) {
		return dao.addEmployee(e);
	}

	@Override
	public Employee updateEmployee(Employee e) {
		return dao.updateEmployee(e);
	}

	@Override
	public String deleteEmployee(int eid) {
		return dao.deleteEmployee(eid);
	}

	@Override
	public Employee getEmployee(int eid) {
		return dao.getEmployee(eid);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return dao.getAllEmployee();
	}
	
	 

}

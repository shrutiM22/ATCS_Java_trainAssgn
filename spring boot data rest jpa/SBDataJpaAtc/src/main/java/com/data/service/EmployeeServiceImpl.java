package com.data.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.data.dao.EmployeeDao;
import com.data.entity.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDao dao;

	@Override
	public Employee addEmployee(Employee e) {
		return dao.save(e);
	}

	@Override
	public Employee updateEmployee(Employee e) {
		return dao.save(e);
	}

	@Override
	public void deleteEmployee(int eid) {
		dao.deleteById(eid);
	}

	@Override
	public Optional<Employee> getEmployee(int eid) {
		return dao.findById(eid);
	}

	@Override
	public Iterable<Employee> getAllEmployee() {
		return dao.findAll();
	}
	
	 

}

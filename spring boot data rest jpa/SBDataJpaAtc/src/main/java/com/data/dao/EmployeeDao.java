package com.data.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.data.entity.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer>{
	
	

}

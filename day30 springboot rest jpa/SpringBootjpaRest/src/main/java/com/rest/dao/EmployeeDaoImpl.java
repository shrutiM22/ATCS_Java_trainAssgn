package com.rest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.rest.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	@PersistenceContext
	 EntityManager entity;

	@Override
	public Employee addEmployee(Employee e) {
		entity.persist(e);
		return entity.find(Employee.class, e.getEid());
	}

	@Override
	public Employee updateEmployee(Employee e) {
		return entity.merge(e);
	}

	@Override
	public String deleteEmployee(int eid) {
		Employee emp = entity.find(Employee.class, eid);
		if(emp!=null) {
			entity.remove(emp);
			return "employee deleted";
		}
		else {
			return "employee not found";
		}
	}

	@Override
	public Employee getEmployee(int eid) {
		return entity.find(Employee.class,eid);
	}

	@Override
	public List<Employee> getAllEmployee() {
		TypedQuery<Employee> result = entity.createQuery("Select e from Employee e",Employee.class);
		return result.getResultList();
	}

}

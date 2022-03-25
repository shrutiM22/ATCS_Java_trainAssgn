package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.Employee;
import com.rest.service.EmployeeService;

@RestController
@RequestMapping("/eee")     //http://localhost:8624/eee --class url
public class EmpController {
	
	@Autowired
	EmployeeService service;
	
	@PostMapping("/addEmployee")   // http://localhost:8624/eee/addEmployee
	public Employee addEmployee(@RequestBody Employee emp) {
		
		return service.addEmployee(emp);
		
	}
	
	@PutMapping("/updateEmployee")   // http://localhost:8624/eee/updateEmployee
	public Employee updateEmployee(@RequestBody Employee emp) {
		
		return service.updateEmployee(emp);
		
	}
	
	
	@GetMapping("/getEmployee/{eid}")   // http://localhost:8624/eee/getEmployee/eid
	public Employee getEmployee(@PathVariable("eid") int eid) {
		
		return service.getEmployee(eid);
		
	}
	
	
	@GetMapping("/getAllEmployee")   // http://localhost:8624/eee/getAllEmployee
	public List<Employee> getAllEmployee() {
		
		return service.getAllEmployee();
		
	}
	
	@DeleteMapping("/deleteEmployee/{eid}")   // http://localhost:8624/eee/deleteEmployee/eid
	public String deleteEmployee(@PathVariable("eid") int eid) {
		
		return service.deleteEmployee(eid);
		
	}

	
	


}

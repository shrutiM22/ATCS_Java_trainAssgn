package com.boot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import com.boot.entity.Employee;
import com.boot.service.EmployeeService;

@SpringBootTest
class SpringBootDemoAtcApplicationTests {

	@Autowired
	EmployeeService service;
	
	@Test
	void testAddEmployee() {
		Employee e = new Employee(111,"mehul",1235,"Jaipur");
		
		Employee emp = service.addEmployee(e);
		assertEquals(emp.getEname(),"mehul");
		
	}
	
//	@Test
//	void testUpdateEmployee() {
//		Employee e = new Employee(111,"Julia",1235,"Jaipur");
//		
//		Employee emp = service.updateEmployee(e);
//		assertEquals(emp.getEname(),"Julia");
//		
//	}
	
//	@Test
//	void testDeleteEmployee() {
//		String emp = service.deleteEmployee(111);
//		
//		assertEquals(emp,"Employee deleted");
//		
//	}
	
//	@Test
//	void testgetAllEmployee() {
//		List<Employee> emp = service.getAllEmployee();
//		assertTrue(emp.size()>0);
//		
//	}
	
	

	

}

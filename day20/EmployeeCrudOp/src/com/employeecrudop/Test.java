package com.employeecrudop;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Test {

	
	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sathya");
		
		EntityManager entity= factory.createEntityManager(); 
		
		//persist()-->save or insert, merge()-->update, remove()-->delte, find()==>selct fetch
		
		Employee emp= new Employee(123, "soma", 1000, "hyderabad");
		Employee e1 = new Employee(124,"dore",3440,"delhi");
		
		entity.getTransaction().begin();
		
		entity.persist(emp);
		entity.persist(e1);
		Employee emp1=entity.find(Employee.class, 123);
		System.out.println(emp1); 
		
		
		
		entity.merge(emp);
		//entity.remove(emp);
		
		
		entity.getTransaction().commit();
	}
}

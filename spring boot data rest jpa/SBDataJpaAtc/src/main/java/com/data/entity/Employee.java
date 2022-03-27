package com.data.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sbdataemp")
public class Employee {
	
	@Id
	//@Column(name="empid" length=10)	//if want to change name of column
	private int eid;
	private String ename;
	private int esalary;
	private String eadd;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, int esalary, String eadd) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.eadd = eadd;
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	public String getEadd() {
		return eadd;
	}
	public void setEadd(String eadd) {
		this.eadd = eadd;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", eadd=" + eadd + "]";
	}
	
	
	
	
	

}

package SpringCoreAutowireAtc.com.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("employee")
@Scope("prototype")

public class Employee {

	private int eid;
	private String ename;
	private int esalary;
	//private String eadd;
		//@Autowired  //by type
	
		Address address;
	
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
//	public String getEadd() {
//		return eadd;
//	}
//	public void setEadd(String eadd) {
//		this.eadd = eadd;
//	}
//	
	public Address getAddress() {
		return address;
	}
	
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", Address=" + address + "]";
	}
	public Employee(int eid, String ename, int esalary, Address address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.address = address;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

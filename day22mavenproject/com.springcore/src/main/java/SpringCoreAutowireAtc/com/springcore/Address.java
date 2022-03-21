package SpringCoreAutowireAtc.com.springcore;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private int no;
	private String colony;
	private String district;
	private String state;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Address(int no, String colony, String district, String state) {
		super();
		this.no = no;
		this.colony = colony;
		this.district = district;
		this.state = state;
	}


	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getColony() {
		return colony;
	}
	public void setColony(String colony) {
		this.colony = colony;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}



	@Override
	public String toString() {
		return "Address [no=" + no + ", colony=" + colony + ", district=" + district + ", state=" + state + "]";
	}

}

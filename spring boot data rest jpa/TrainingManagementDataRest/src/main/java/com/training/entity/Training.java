package com.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="training")
public class Training {
	
	@Id
	private int tid;
	private String tname;
	private int tstipend;
	//@Column(name="tduration")
	private int tduration;
	
		
	public Training() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Training(int tid, String tname, int tstipend, int tduration) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tstipend = tstipend;
		this.tduration = tduration;
	}
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getTstipend() {
		return tstipend;
	}
	public void setTstipend(int tstipend) {
		this.tstipend = tstipend;
	}
	public int getDuration() {
		return tduration;
	}
	public void setDuration(int tduration) {
		this.tduration = tduration;
	}
	
	@Override
	public String toString() {
		return "Training [tid=" + tid + ", tname=" + tname + ", tstipend=" + tstipend + ", tduration=" + tduration + "]";
	}
	
	
	
	
	
	
	

}

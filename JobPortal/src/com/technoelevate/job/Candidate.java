package com.technoelevate.job;

public class Candidate {
	
	String name;
	long mobile;
	double percentage;
	int yop;
	public Candidate(String name, long mobile, double percentage ,int yop) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.percentage = percentage;
		this.yop=yop;
		
	}
	@Override
	public String toString() {
		return "Candidate [name=" + name + ", mobile=" + mobile + ", percentage=" + percentage + ", yop=" + yop + "]";
	}
	
	
	

}

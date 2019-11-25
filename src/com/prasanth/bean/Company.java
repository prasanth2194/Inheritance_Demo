package com.prasanth.bean;

public class Company {
	
	public Company() {
		this.companyName = "prasanth";
	}
	
	public Company(String companyName){
		this.companyName = companyName;
	}
	
	private String companyName;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	

}

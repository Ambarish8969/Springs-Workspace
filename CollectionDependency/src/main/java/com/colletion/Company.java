package com.colletion;

import java.util.List;

public class Company {
	private String companyName;
	private String companyLocation;
	private List<String> employees;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyLocation() {
		return companyLocation;
	}
	public void setCompanyLocation(String companyLocation) {
		this.companyLocation = companyLocation;
	}
	public List<String> getEmployees() {
		return employees;
	}
	public void setEmployees(List<String> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", companyLocation=" + companyLocation + ", employees="
				+ employees + "]";
	}
	
	
}

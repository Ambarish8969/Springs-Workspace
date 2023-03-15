package com.colletionSet;

import java.util.Set;

public class Company2 {
	private String companyName;
	private String companyLocation;
	private Set<String> employees;
	
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
	public Set<String> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<String> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", companyLocation=" + companyLocation + ", employees="
				+ employees + "]";
	}
}

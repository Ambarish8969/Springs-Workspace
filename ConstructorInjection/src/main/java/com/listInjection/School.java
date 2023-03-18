package com.listInjection;

import java.util.List;

public class School {
	private String schoolName;
	private List<String> noOfClasses;

	public School(String schoolName, List<String> noOfClasses) {
		super();
		this.schoolName = schoolName;
		this.noOfClasses = noOfClasses;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public List<String> getNoOfClasses() {
		return noOfClasses;
	}

	public void setNoOfClasses(List<String> noOfClasses) {
		this.noOfClasses = noOfClasses;
	}

	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", noOfClasses=" + noOfClasses + "]";
	}

}

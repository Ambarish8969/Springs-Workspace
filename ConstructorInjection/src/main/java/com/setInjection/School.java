package com.setInjection;

import java.util.List;
import java.util.Set;

public class School {
	private String schoolName;
	private Set<String> noOfClasses;

	public School(String schoolName, Set<String> noOfClasses) {
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

	public Set<String> getNoOfClasses() {
		return noOfClasses;
	}

	public void setNoOfClasses(Set<String> noOfClasses) {
		this.noOfClasses = noOfClasses;
	}

	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", noOfClasses=" + noOfClasses + "]";
	}
}

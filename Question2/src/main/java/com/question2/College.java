package com.question2;

import java.util.List;

public class College {
	private String collegeName;
	private String location;
	private List<Branch> branchs;

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Branch> getBranch() {
		return branchs;
	}

	public void setBranch(List<Branch> branchs) {
		this.branchs = branchs;
	}

	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", location=" + location + ", branch=" + branchs + "]";
	}

}

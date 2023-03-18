package com.mapInjection;

import java.util.Map;

public class School {
	private String schoolName;
	private Map<String, Integer> classAndnoOfStu;

	public School(String schoolName, Map<String, Integer> classAndnoOfStu) {
		super();
		this.schoolName = schoolName;
		this.classAndnoOfStu = classAndnoOfStu;
	}

	public Map<String, Integer> getClassAndnoOfStu() {
		return classAndnoOfStu;
	}

	public void setClassAndnoOfStu(Map<String, Integer> classAndnoOfStu) {
		this.classAndnoOfStu = classAndnoOfStu;
	}

	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", classAndnoOfStu=" + classAndnoOfStu + "]";
	}

}

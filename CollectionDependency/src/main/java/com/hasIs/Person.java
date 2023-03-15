package com.hasIs;

public class Person {
	@Override
	public String toString() {
		return "Person [person_name=" + person_name + ", address=" + address + "]";
	}

	private String person_name;
	private Address address;

	public String getPerson_name() {
		return person_name;
	}

	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}

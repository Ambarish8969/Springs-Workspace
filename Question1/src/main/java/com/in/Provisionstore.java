package com.in;

import java.util.List;

public class Provisionstore {
private String storename;
private String location;
private List<Customer> custom;
public Provisionstore(String storename, String location, List<Customer> custom) {
	super();
	this.storename = storename;
	this.location = location;
	this.custom = custom;
}
@Override
public String toString() {
	return "Provisionstore [storename=" + storename + ", location=" + location + ", custom=" + custom + "]";
}

}

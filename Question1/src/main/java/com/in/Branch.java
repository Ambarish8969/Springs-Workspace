package com.in;

import java.util.List;

public class Branch {
	private String location;
	private List<Provisionstore> prov;
	public Branch(String location, List<Provisionstore> prov) {
		super();
		this.location = location;
		this.prov = prov;
	}
	@Override
	public String toString() {
		return "Branch [location=" + location + ", prov=" + prov + "]";
	}


}

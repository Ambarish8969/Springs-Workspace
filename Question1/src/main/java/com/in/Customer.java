package com.in;

public class Customer {
	private int customerid;
	private String customername;
	private long phno;
	public Customer(int customerid, String customername, long phno) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customername=" + customername + ", phno=" + phno + "]";
	}
}

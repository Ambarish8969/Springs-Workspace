package com.interfaceinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // class-level annotation , it will create object.
public class Customer {
	@Value("123") // use to assign the value to primitive dependency
	private int customerId;
	@Value("Ambika")
	private String customerName;
	@Value("9900408969")
	private long phoneNumber;
	@Autowired  // for reference variable(reference-type of dependency) we use this annotation and it stores the object of implementation class.
	@Qualifier("savings") // class name should be in LowerCase i.e : 'savings'. and UpCasting is done here.
	private Account account;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", phoneNumber=" + phoneNumber
				+ ", account=" + account + "]";
	}

}

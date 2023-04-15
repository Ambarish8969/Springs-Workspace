package com.in;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("com/in/config1.xml");
		Customer customer=(Customer) c.getBean("cust1");
		System.out.println(customer);
		Branch branch=(Branch) c.getBean("branch");
		System.out.println(branch);
		
	}

}

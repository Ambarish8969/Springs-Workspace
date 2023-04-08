package com.interfaceinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/interfaceinjection/config.xml");
		Customer customer=(Customer) c1.getBean("customer");
		System.out.println(customer);
		customer.getAccount().withdraw();
		customer.getAccount().deposit();
	}
}

package com.constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		// IOC Container(spring container).
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/constructor/config.xml");
		
		Vehicle vehicle1=(Vehicle)c1.getBean("vehicle1");
		System.out.println(vehicle1);
		
		Vehicle vehicle2=(Vehicle)c1.getBean("vehicle2");
		System.out.println(vehicle2);
		
		Vehicle vehicle3=(Vehicle)c1.getBean("vehicle3");
		System.out.println(vehicle3);
	}
}
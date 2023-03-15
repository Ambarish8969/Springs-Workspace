package com.hasIs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/hasIs/config.xml");
//		Person person=(Person)c1.getBean("person");
//		System.out.println(person);
		
		Address address=(Address)c1.getBean("address1");
		System.out.println(address);
	}
}

package com.valueasattribute;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/valueasattribute/config.xml");
//		Employee e1=(Employee) c1.getBean("employee");
		System.out.println(c1.getBean("employee1"));
		System.out.println(c1.getBean("employee2"));
	}
}

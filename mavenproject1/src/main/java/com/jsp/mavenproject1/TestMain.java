package com.jsp.mavenproject1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		// IOC Container , we use this because we are using XML based configuration
		// We use this context because to store the values.
		// ClassPathXmlApplicationContext is implementation class of ApplicationContext.
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/jsp/mavenproject1/config.xml");
		// ClassPathXmlApplicationContext c1=new Student();
		
		// DownCasting
		// We are doing DownCasting because , using the above UpCasted reference variable
		// we are able to access only superclass properties but properties are present in
		// subclass that is why we DownCast it.
		Student s1=(Student)c1.getBean("student");
		System.out.println(s1);
		
	}
}

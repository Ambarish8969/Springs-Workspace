package com.question2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDependent {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("com/question2/config.xml");
		College college=(College) c.getBean("college");
		System.out.println(college);
	}
}

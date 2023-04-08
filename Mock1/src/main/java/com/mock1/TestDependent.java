package com.mock1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDependent {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("com/mock1/config.xml");
		Student std=(Student) c.getBean("student");
		System.out.println(std);
		Student std2=(Student) c.getBean("student2");
		System.out.println(std2);
		Student std3=(Student) c.getBean("student3");
		System.out.println(std3);
	}
}

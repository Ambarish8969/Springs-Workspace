package com.jsp.package1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c3=new ClassPathXmlApplicationContext("com/jsp/package1/config.xml");
		Student s1=(Student) c3.getBean("student1");
		Student s2=(Student) c3.getBean("student2");
		Student s3=(Student) c3.getBean("student3");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}

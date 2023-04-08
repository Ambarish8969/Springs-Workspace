package com.mock2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDependent {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("com/mock2/config.xml");
		Vehicle v=(Vehicle) c.getBean("vehicle1");
		System.out.println(v);
	}
}

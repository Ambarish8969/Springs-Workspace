package com.jsp.valueaselement;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c2=new ClassPathXmlApplicationContext("com/jsp/employeemaven/config.xml");
		Employee e1=(Employee)c2.getBean("employee");
		System.out.println(e1);
	}
}

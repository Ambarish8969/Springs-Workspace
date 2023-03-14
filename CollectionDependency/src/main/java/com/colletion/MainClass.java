package com.colletion;

import java.util.List;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/colletion/config.xml");
		Company co1=(Company)c1.getBean("companyList");
		System.out.println(co1);
		List<String> list1=co1.getEmployees();// to know the which class object is created.
		System.out.println(list1.getClass()); // container will choose immediate subclass of List interface.
		
		
	}
}

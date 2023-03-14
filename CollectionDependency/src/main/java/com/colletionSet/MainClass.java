package com.colletionSet;

import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.colletion.Company;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/colletionSet/config.xml");
		Company2 co2=(Company2)c1.getBean("companySet");
		System.out.println(co2);
//		Set<Company2> set1=co2.getEmployees();
//		System.out.println(set1.getClass());
	}
}

package com.setInjection;

import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/setInjection/config.xml");
		School school=(School)c1.getBean("school2");
		System.out.println(school);
		Set<String> set=school.getNoOfClasses();
		System.out.println(set.getClass());
	}
}

package com.listInjection;

import java.util.List;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/listInjection/config.xml");
		School school1=(School)c1.getBean("school1");
		System.out.println(school1);
		List<String> list=school1.getNoOfClasses();
		System.out.println(list.getClass());
		
	}
}

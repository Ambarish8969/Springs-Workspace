package com.mapInjection;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/mapInjection/config.xml");
		School school=(School)c1.getBean("school1");
		System.out.println(school);
		Map<String,Integer> map=school.getClassAndnoOfStu();
		System.out.println(map.getClass());
	}
}

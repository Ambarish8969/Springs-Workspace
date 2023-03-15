package com.collectionMap;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/collectionMap/config.xml");
		Country country=(Country)c1.getBean("country");
		System.out.println(country);
		Map<String,String> map=country.getStateAndLanguage();
		System.out.println(map.getClass());
	}
}
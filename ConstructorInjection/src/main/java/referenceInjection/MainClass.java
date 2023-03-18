package referenceInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("referenceInjection/config.xml");
		Companuy companuy=(Companuy)c1.getBean("company");
		System.out.println(companuy);
	}
}

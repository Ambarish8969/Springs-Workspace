package consturctorAmbiguity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("consturctorAmbiguity/config.xml");
		Sample sample1=(Sample)c1.getBean("sample1");
		System.out.println(sample1);
		
		Sample sample2=(Sample)c1.getBean("sample2");
		System.out.println(sample2);
		
		Sample sample3=(Sample)c1.getBean("sample3");
		System.out.println(sample3);
	}
}

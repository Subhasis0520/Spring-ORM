package spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.dao.StudentImp;

public class Fetch1Data {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		
		StudentImp sImp = ac.getBean("s1",StudentImp.class);
		
		Student student = sImp.getDetails(13);
		System.out.println(student);
	}
}
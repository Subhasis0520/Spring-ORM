package spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.dao.StudentImp;

public class DeleteData {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		
		StudentImp sImp = ac.getBean("s1",StudentImp.class);
		
		int row = sImp.delete(12);
		System.out.println("no of row deleted= "+row);
	}
}

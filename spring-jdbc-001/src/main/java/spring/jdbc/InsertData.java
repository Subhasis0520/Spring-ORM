package spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.dao.StudentImp;

public class InsertData {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		
		StudentImp sImp = ac.getBean("s1",StudentImp.class);
		
		Student s = new Student();
		s.setSid(12);
		s.setName("Kamal");
		s.setAge(21);
		s.setFavSub("Phy");
		
		int row = sImp.insert(s);
		System.out.println("no of row insert-> "+row);
	}
}

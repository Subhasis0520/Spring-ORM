package spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.dao.StudentImp;

public class UpdateData {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		
		StudentImp sImp = ac.getBean("s1",StudentImp.class);
		
		Student s = new Student();
		s.setSid(12);
		s.setName("Rajesh");
		s.setAge(20);
		s.setFavSub("Bengali");
		
		int row = sImp.update(s);
		System.out.println("no of row update= "+row);
	}
}

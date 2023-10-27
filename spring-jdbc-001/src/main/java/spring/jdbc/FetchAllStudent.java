package spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.dao.StudentImp;

public class FetchAllStudent {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		
		StudentImp sImp = ac.getBean("s1",StudentImp.class);
		
		List<Student> students = sImp.getAllDetails();
		for(Student s : students) {
			System.out.println(s);
		}
	}
}

package jdbc.anno;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.dao.StudentImp;
import spring.jdbc.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac  = new AnnotationConfigApplicationContext(MyConfig.class);
		
		StudentImp s = ac.getBean("s1",StudentImp.class);
		
		/*
		// insert data
		Student s1 = new Student();
		s1.setSid(2); s1.setName("Samir"); s1.setAge(17); s1.setFavSub("geo");
		int insert = s.insert(s1);
		System.out.println("no of row inserted= "+insert);
		*/
		
		
		/*
		// update the data
		Student s1 = new Student();
		s1.setSid(2); s1.setName("Abhijit"); s1.setAge(15); s1.setFavSub("Geography");
		int update = s.update(s1);
		System.out.println("no of row update= "+update);
		*/
		
		
		/*
		// delete data
		int delete = s.delete(11);
		System.out.println("no of row delete= "+delete);
		*/
		
		Student student = s.getDetails(1);
		System.out.println(student);
		
		List<Student> students = s.getAllDetails();
		for(Student stu : students) {
			System.out.println(stu);
		}
	}
}

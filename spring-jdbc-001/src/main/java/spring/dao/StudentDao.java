package spring.dao;

import java.util.List;

import spring.jdbc.Student;

public interface StudentDao {

	public int insert(Student s);
	public int update(Student student);
	public int delete(int id);
	public Student getDetails(int id);
	public List<Student> getAllDetails();
}

package orm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import orm.entity.Student;


public class StudentDao {

	private HibernateTemplate hibernateTemplate;

		
	// save the data && insert the data
	@Transactional
	public int insert(Student student)
	{
		Integer i = (Integer) this.hibernateTemplate.save(student);	   
		return i;
	}
	
	//get the single data
	public Student getStudent(int studentId)
	{
		Student s = this.hibernateTemplate.get(Student.class,studentId);
		return s;
	}
	
	// get all the row data
	public List<Student> getAllDeatils()
	{
	 	List<Student> stu =this.hibernateTemplate.loadAll(Student.class);
	    return stu;
	}
	
	// deleteing the data
	@Transactional
	public void deleteStudent(int studentId)
	{
		Student s1 = this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(s1);
	}
	
	//update the data
	@Transactional
	public void updateStudent(Student student)
	{
		this.hibernateTemplate.update(student);
	}
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate)
	{
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public HibernateTemplate getHibernateTemplate()
	{
		return hibernateTemplate;
	}
}

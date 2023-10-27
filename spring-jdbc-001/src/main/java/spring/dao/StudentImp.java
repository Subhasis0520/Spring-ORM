package spring.dao;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import spring.jdbc.Student;

public class StudentImp implements StudentDao {

	private JdbcTemplate jdbcTemplate;
	
	// to insert the data
	public int insert(Student s) {
		String iQuery = "INSERT INTO student VALUES(?,?,?,?)";
		int ins = this.jdbcTemplate.update(iQuery,s.getSid(),s.getName(),s.getAge(),s.getFavSub());
		return ins;
	}

	// to update the existing data
	public int update(Student student) {
		String uQuery = "UPDATE student SET name=?,age=?,fav=? WHERE sid=?";
		int update = this.jdbcTemplate.update(uQuery,student.getName(),student.getAge(),student.getFavSub(),student.getSid());
		return update;
	}

	// to delete the data
	public int delete(int id) {
		String dQuery = "DELETE FROM student where sid=?";
		int delete = this.jdbcTemplate.update(dQuery,id);
		return delete;
	}

	// get the details of one student
	public Student getDetails(int id) {
		String sQuery = "SELECT * FROM student WHERE sid=?";
		RowMapper<Student> rowMapper = new RowMapperImp();
		Student res = this.jdbcTemplate.queryForObject(sQuery,rowMapper ,id);
		return res;
	}

	// get the details of all the student
	public List<Student> getAllDetails() {
		String query = "SELECT * FROM student";
		
		/*  
		 * using anonymous class
		 * 
		RowMapper<Student> rowMaaper = new RowMapper<Student>() {
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student s = new Student();
				s.setSid(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setAge(rs.getInt(3));
				s.setFavSub(rs.getString(4));
				return s;
			}
		};
		*/
		RowMapper<Student> rowMaaper = new RowMapperImp();
		List<Student> students = this.jdbcTemplate.query(query, rowMaaper);
		return students;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


}

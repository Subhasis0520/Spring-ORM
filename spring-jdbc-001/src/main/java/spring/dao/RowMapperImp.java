package spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import spring.jdbc.Student;


public class RowMapperImp implements RowMapper<Student>{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student s = new Student();
		s.setSid(rs.getInt(1));
		s.setName(rs.getString(2));
		s.setAge(rs.getInt(3));
		s.setFavSub(rs.getString(4));
		return s;
	}

}

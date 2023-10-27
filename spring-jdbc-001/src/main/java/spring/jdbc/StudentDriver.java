package spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDriver {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		
		JdbcTemplate bean = ac.getBean("jdbcTemplate",JdbcTemplate.class);
		
		String query = "INSERT INTO student VALUES(?,?,?,?)";
		int res = bean.update(query,13,"Anup",22,"Biology");
		System.out.println("No of row insert-> "+res);
	}
}

/*
   It is not a recommend way because it is tight coupling
*/
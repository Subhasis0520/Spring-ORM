package jdbc.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import spring.dao.StudentImp;


@Configuration
public class MyConfig {

	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc_001");
		ds.setUsername("root");
		ds.setPassword("Subhasis@123");
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(getDataSource());
		return jt;
	}
	
	@Bean(value = {"studentDao","s1"})
	public StudentImp getStudent() {
		StudentImp s = new StudentImp();
		s.setJdbcTemplate(getJdbcTemplate());
		return s;
	}
}

package mvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mvc.entity.User;

@Repository
public class UserDao {

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Transactional
	public String save(User user) {
		String save = (String) this.hibernateTemplate.save(user);
		return save;
	}
	
	public List<User> getAll() {
		List<User> list = this.hibernateTemplate.loadAll(User.class);
		return list;
	}
}

package mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvc.dao.UserDao;
import mvc.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public String createData(User user) {
		return this.userDao.save(user);
	}
	
	public List<User> get(){
		return this.userDao.getAll();
	}
}

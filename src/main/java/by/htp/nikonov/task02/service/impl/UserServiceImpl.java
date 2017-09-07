package by.htp.nikonov.task02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.htp.nikonov.task02.DAO.UserDAO;
import by.htp.nikonov.task02.entity.User;
import by.htp.nikonov.task02.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDAO userDAO;
	
	@Override
	public User getByID(Integer id) {
		
		return userDAO.getByID(id);
	}

	@Override
	public void save(User user) {
		userDAO.save(user);
		
	}

	@Override
	public List<User> getAll() {
		
		return userDAO.getAll();
	}

	@Override
	public void deleteUser(Integer id) {
		userDAO.deleteUser(id);
		
	}

	@Override
	public void deleteUser(User user) {
		userDAO.deleteUser(user);
		
	}

}

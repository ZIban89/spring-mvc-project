package by.htp.nikonov.task02.service;

import java.util.List;

import by.htp.nikonov.task02.entity.User;

public interface UserService {

	User getByID(Integer id);
	void save(User user);
	List<User> getAll();
	void deleteUser(Integer id);
	void deleteUser(User user);
}

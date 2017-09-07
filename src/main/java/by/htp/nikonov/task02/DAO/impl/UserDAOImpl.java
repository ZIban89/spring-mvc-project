package by.htp.nikonov.task02.DAO.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.htp.nikonov.task02.DAO.UserDAO;
import by.htp.nikonov.task02.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public User getByID(Integer id) {
		User user = null;
		try (Session session = sessionFactory.openSession()) {
			session.beginTransaction();
			user = session.get(User.class, id);
			session.getTransaction().commit();
		}
		return user;
	}

	@Override
	public void save(User user) {

		try (Session session = sessionFactory.openSession()) {
			session.beginTransaction();
			session.saveOrUpdate(user);
			session.getTransaction().commit();
		}
		
	}

	@Override
	public List<User> getAll() {
		List<User> list = null;
		try (Session session = sessionFactory.openSession()) {
			session.beginTransaction();
			list = session.createQuery("FROM User").list();
			session.getTransaction().commit();
		}
		return list;
	}

	@Override
	public void deleteUser(Integer id) {
		try (Session session = sessionFactory.openSession()) {
			session.beginTransaction();
			session.createQuery("delete from User where id="+id).executeUpdate();
			session.getTransaction().commit();
		}

	}

	@Override
	public void deleteUser(User user) {
		try (Session session = sessionFactory.openSession()) {
			session.beginTransaction();
			session.delete(user);
			session.getTransaction().commit();
		}
	}

}

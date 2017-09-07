package by.htp.nikonov.task02.DAO.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.htp.nikonov.task02.DAO.CountryDAO;
import by.htp.nikonov.task02.entity.Country;


@Repository
public class CountryDAOImpl implements CountryDAO {

	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public Country findById(String id) {
		Country country = null;
		try (Session session = sessionFactory.openSession()) {
			session.beginTransaction();
			country = session.get(Country.class, id);
			session.getTransaction().commit();
		}
		return country;
	}
		

	@Override
	public List<Country> findAll() {
		List<Country> list = null;
		try (Session session = sessionFactory.openSession()) {
			session.beginTransaction();
			list = session.createQuery("FROM Country").list();
			session.getTransaction().commit();
		}
		return list;
	
	}


	@Override
	public Country findByName(String name) {
		Country country = null;
		try (Session session = sessionFactory.openSession()) {
			session.beginTransaction();
			country=(Country) session.createQuery("from Country c where c.name='"+name+"'").list().get(0);
			session.getTransaction().commit();
		}
		return country;
	}
}

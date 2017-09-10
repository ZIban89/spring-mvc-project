package by.htp.nikonov.task02.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import by.htp.nikonov.task02.entity.Country;
import by.htp.nikonov.task02.entity.User;

@Component
public class HibernateUtil {	
	
	@Bean
	public SessionFactory sessionFactory() {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class)
				.addAnnotatedClass(Country.class).buildSessionFactory();
		return factory;
	}
}

package by.htp.nikonov.task02.DAO;

import java.util.List;

import by.htp.nikonov.task02.entity.Country;


public interface CountryDAO {

	Country findById(String id);
	List<Country> findAll();
	Country findByName(String name);
}

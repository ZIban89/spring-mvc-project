package by.htp.nikonov.task02.service;

import java.util.List;

import by.htp.nikonov.task02.entity.Country;

public interface CountryService {
	Country findById(String id);
	List<Country> findAll();
	Country findByName(String name);
}

package by.htp.nikonov.task02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.htp.nikonov.task02.DAO.CountryDAO;
import by.htp.nikonov.task02.entity.Country;
import by.htp.nikonov.task02.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService{
	
	@Autowired
	CountryDAO countryDAO;
	
	public Country findById(String id) {
		return countryDAO.findById(id);
	};
	public List<Country> findAll(){
		return countryDAO.findAll();
	}
	@Override
	public Country findByName(String name) {
		
		return countryDAO.findByName(name);
	};
}

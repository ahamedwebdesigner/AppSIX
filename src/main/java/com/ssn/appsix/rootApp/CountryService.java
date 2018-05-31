package com.ssn.appsix.rootApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssn.appsix.entity.Country;


@Service("countryService")
public class CountryService {

	 
	@Autowired
	CountryDAO countryDao;
	

	public void addCountry(Country country) {
		countryDao.addCountry(country);
	}


	public List getAllCountries() {
		
		return countryDao.getAllCountries();
	}



	public Country getCountry(int id) {
	  return countryDao.getCountry(id);
	}

}

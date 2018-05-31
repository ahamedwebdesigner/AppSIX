package com.ssn.appsix.rootApp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ssn.appsix.entity.Country;

@Repository
public class CountryDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public Country addCountry(Country country) {
		  Session session = this.sessionFactory.getCurrentSession();
		  session.persist(country);
		  return country;
		}

	@Transactional
	public List getAllCountries() {
		  Session session = this.sessionFactory.getCurrentSession();
		  List countryList = session.createQuery("from Country").list();
		  return countryList;
		}

	@Transactional
	public Country getCountry(int id) {
		  Session session = this.sessionFactory.getCurrentSession();
		  Country country = (Country) session.load(Country.class, new Integer(id));
		  return country;
		}
	
	
		 
	
}

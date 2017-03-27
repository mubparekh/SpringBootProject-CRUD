package com.mp.SpringBootProject;

import java.util.Collection;



public interface CountryDao {

	Collection<Country> getAllCountries();

	Country getCountryById(int id);

	void removeCountryById(int id);

	void updateCountry(Country country);

	void insertCountryToDb(Country country);

}
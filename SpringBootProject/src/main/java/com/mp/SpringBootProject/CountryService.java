package com.mp.SpringBootProject;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
	
	@Autowired
	@Qualifier("mongoData")
	private CountryDao countryDao;

	public Collection<Country> getAllCountries(){
		return this.countryDao.getAllCountries();
	}

	public Country getCountryById(int id){
		//check can be done: if the student exists return actual data else Htp code/request that the data is not available
		return this.countryDao.getCountryById(id);
	}

	public void removeCountryById(int id) {
		//check can be done: if the student exists delete that data else Htp code/request that the data is not available
		this.countryDao.removeCountryById(id);
		
	}

	public void updateCountry(Country country) {
		this.countryDao.updateCountry(country);
		
	}

	public void insertCountry(Country country) {
		this.countryDao.insertCountryToDb(country);
	}

}

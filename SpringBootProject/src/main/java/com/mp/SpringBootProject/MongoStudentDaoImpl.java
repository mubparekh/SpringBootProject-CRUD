package com.mp.SpringBootProject;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("mongoData")
public class MongoStudentDaoImpl implements CountryDao{

	@Override
	public Collection<Country> getAllCountries() {
		return new ArrayList<Country>(){
			{
				add(new Country(1, "Mario", "Nothing"));
			}
		};
	}

	@Override
	public Country getCountryById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeCountryById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCountry(Country country) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertCountryToDb(Country country) {
		// TODO Auto-generated method stub
		
	}

}

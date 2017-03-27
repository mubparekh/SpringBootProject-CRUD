package com.mp.SpringBootProject;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("mysqlData")
public class MysqlCountryDaoImpl implements CountryDao{

	@Override
	public Collection<Country> getAllCountries() {
		// TODO Auto-generated method stub
		return null;
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

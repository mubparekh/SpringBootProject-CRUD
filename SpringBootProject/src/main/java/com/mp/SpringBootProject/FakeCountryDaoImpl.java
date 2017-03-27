package com.mp.SpringBootProject;

//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("fakeData")
public class FakeCountryDaoImpl implements CountryDao {
	private static Map<Integer, Country> countries;
	
	static{
		countries = new HashMap<Integer, Country>(){
			{
				put(1,new Country(1, "India", "India is a secular state."));
				put(2,new Country(2, "Bangladesh", "Bangladesh is a neighbouring country to India."));
				put(3,new Country(3, "Sri Lanka", "Sri Lanka is a small country."));
			}
		};
	}
	
	/* (non-Javadoc)
	 * @see com.mp.SpringBootProject.countryDao#getAllCountries()
	 */
	@Override
	public Collection<Country> getAllCountries(){
		return this.countries.values();
	}
	
	/* (non-Javadoc)
	 * @see com.mp.SpringBootProject.countryDao#getCountryById(int)
	 */
	@Override
	public Country getCountryById(int id){
		return this.countries.get(id);
	}

	/* (non-Javadoc)
	 * @see com.mp.SpringBootProject.countryDao#removeCountryById(int)
	 */
	@Override
	public void removeCountryById(int id) {
		this.countries.remove(id);
	}
	
	/* (non-Javadoc)
	 * @see com.mp.SpringBootProject.countryDao#updateCountry(com.mp.SpringBootProject.Country)
	 */
	@Override
	public void updateCountry(Country country){
		Country c = countries.get(country.getId());
		c.setCountry_name(country.getCountry_name());
		c.setCountry_info(country.getCountry_info());
		countries.put(country.getId(), country);
	}

	/* (non-Javadoc)
	 * @see com.mp.SpringBootProject.countryDao#insertCountryToDb(com.mp.SpringBootProject.Country)
	 */
	@Override
	public void insertCountryToDb(Country country) {
		this.countries.put(country.getId(), country);
		
	}
}

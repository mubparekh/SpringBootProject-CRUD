package com.mp.SpringBootProject;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryController {
	
	@Autowired // dependancy injections beans- spring Boot will instanciate the CountryInfoService 
	private CountryService countryService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Country> getAllCountries(){
		return countryService.getAllCountries();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Country getCountryById(@PathVariable("id") int id){
		return countryService.getCountryById(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteCountryById(@PathVariable("id") int id){
		countryService.removeCountryById(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void updateCountry(@RequestBody Country country){
		countryService.updateCountry(country);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void insertCountry(@RequestBody Country country){
		countryService.insertCountry(country);
	}
	
	
	/*@RequestMapping(method = RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE)
	// the new information will be provided by JSON type text, hence input requires "consume type" and annotation "@RequestBody" to recognize the input
	public void updateCountry(@RequestBody Country country){
		countryService.updateCountry(country);
	}
	
	/*@RequestMapping(method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	// the new information will be provided by JSON type text, hence input requires "consume type" and annotation "@RequestBody" to recognize the input
	public void insertCountry(@RequestBody Country country){
		countryService.insertCountry(country);
	}*/
}

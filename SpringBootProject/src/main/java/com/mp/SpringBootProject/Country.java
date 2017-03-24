package com.mp.SpringBootProject;

public class Country {
	
	private int id;
	private String country_name;
	private String country_info;
	
	public Country(int id, String country_name, String country_info) {
		this.id = id;
		this.country_name = country_name;
		this.country_info = country_info;
	}
	
	public Country(){}
	
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountry_info() {
		return country_info;
	}
	public void setCountry_info(String country_info) {
		this.country_info = country_info;
	}
	
}

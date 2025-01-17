package com.vo;

import java.io.Serializable;

//it can also be a JAVA-Bean
public class City implements Serializable{

	private int id;
	private String name;
	private String countryCode;
	private String district;
	private int poulation;
	
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}


	public City(int id, String name, String country_Code, String district,
			int poulation) {
		super();
		this.id = id;
		this.name = name;
		this.countryCode = country_Code;
		this.district = district;
		this.poulation = poulation;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String country_Code) {
		this.countryCode = country_Code;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPoulation() {
		return poulation;
	}
	public void setPoulation(int poulation) {
		this.poulation = poulation;
	}
	
		 
	
}

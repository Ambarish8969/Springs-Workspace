package com.collectionMap;

import java.util.Map;

public class Country {
	private String countryName;
	private Map<String,String> stateAndLanguage;
	
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public Map<String, String> getStateAndLanguage() {
		return stateAndLanguage;
	}
	public void setStateAndLanguage(Map<String, String> stateAndLanguage) {
		this.stateAndLanguage = stateAndLanguage;
	}
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", stateAndLanguage=" + stateAndLanguage + "]";
	}
	
}

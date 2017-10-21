package com.kat.aio.model;

public class TestConfiguration {
	
	private String firstname;
	private String surname;
	
	public TestConfiguration() {}

	public TestConfiguration(String firstname, String surname) {
		
		this.firstname = firstname;
		this.surname = surname;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
}

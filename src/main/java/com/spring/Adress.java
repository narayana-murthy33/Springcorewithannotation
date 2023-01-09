package com.spring;

public class Adress {
	private String street;

	public Adress(String street) {
		
		this.street = street;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
public Adress() {
	
}

@Override
public String toString() {
	return "Adress [street=" + street + "]";
}
}

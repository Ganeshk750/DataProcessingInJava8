package com.ganesh.serilization;

import java.io.Serializable;

public class Address implements Serializable{
	
	private String city;
	private String state;
	
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
	

}

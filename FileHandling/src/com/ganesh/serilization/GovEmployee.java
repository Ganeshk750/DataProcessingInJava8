package com.ganesh.serilization;

public class GovEmployee extends Employee {
	
	private String areaOfExperience;
	private double rating;
	
	public GovEmployee(String areaOfExperience, double rating) {
		super();
		this.areaOfExperience = areaOfExperience;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "GovEmployee [areaOfExperience=" + areaOfExperience + ", rating=" + rating + "," + super.toString() + "]";
	}

	
	
	
	

}

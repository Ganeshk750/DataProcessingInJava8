package com.ganesh;

public class Developer {
	
	private String name;
	private String position;
	private Integer salary;
	
	public Developer(String name, String position, Integer salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Developer [name=" + name + ", position=" + position + ", salary=" + salary + "]";
	}
	
	
	
}
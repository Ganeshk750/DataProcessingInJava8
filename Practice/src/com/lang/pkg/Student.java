package com.lang.pkg;

public class Student {
	
	String name;
	int age;
	String std;
	
	
	public Student(String name, int age, String std) {
		this.name = name;
		this.age = age;
		this.std = std;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((std == null) ? 0 : std.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (std == null) {
			if (other.std != null)
				return false;
		} else if (!std.equals(other.std))
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student("ganesh", 25, "Masters");
		Student s2 = new Student("ganesh", 25, "Master");
		System.out.println(s1.equals(s2));
	}
	

}

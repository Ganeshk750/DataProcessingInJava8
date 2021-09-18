package com.ganesh.serilization;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private String address;
	private static String department;
	private transient String category;
	private List<String> listOfTask;
	private Integer[] scores;
	
	
	public List<String> getListOfTask() {
		return listOfTask;
	}
	public void setListOfTask(List<String> listOfTask) {
		this.listOfTask = listOfTask;
	}
	public Integer[] getScores() {
		return scores;
	}
	public void setScores(Integer[] scores) {
		this.scores = scores;
	}
	public static String getDepartment() {
		return department;
	}
	public static void setDepartment(String department) {
		Employee.department = department;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", category=" + category + " , department=" + department + ", listOfTask=" + listOfTask + "]";
//	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", category=" + category
				+ ", listOfTask=" + listOfTask + ", scores=" + Arrays.toString(scores) + "]";
	}
	
	
	
	
	

}

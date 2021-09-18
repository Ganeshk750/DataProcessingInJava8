package com.ganesh.serilization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizableEmpDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("Ganesh");
		emp.setAddress("BLR");
		emp.setCategory("BIS");
		emp.setDepartment("DEV");

		File file = new File("first.ser");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		System.out.println("Serilized Emp: " + emp);

	}

}

package com.ganesh.serilization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class GovEmployeeSerilzableInharitanceObject {
	public static void main(String[] args) throws IOException {
       GovEmployee emp = new GovEmployee("ECE", 3.5);
        emp.setId(101);
		emp.setName("Ganesh");
		emp.setAddress("BLR");
		emp.setCategory("BIS");
		emp.setDepartment("DEV");
		Address address = new Address("BLR", "Karnataka");
		emp.setAddress(address);
		System.out.println("Actual Employee: "+ emp);
		
		File file = new File("inher.ser");
		FileOutputStream fis = new FileOutputStream(file);
		ObjectOutputStream oo = new ObjectOutputStream(fis);
		oo.writeObject(emp);
		
	}
}

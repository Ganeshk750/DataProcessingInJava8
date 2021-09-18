package com.ganesh.serilization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserilizedEmployee {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File file = new File("first.ser");

		// Now Reading Sterilized obj
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee dEmp = (Employee) ois.readObject();
		System.out.println("Deserilized Emp: " + dEmp);
		fis.close();
		ois.close();
		//Deserilized Emp: Employee [id=101, name=Ganesh, address=BLR, category=null , department=null]
		//Serilized Emp: Employee [id=101, name=Ganesh, address=BLR, category=BIS , department=DEV]
	}

}

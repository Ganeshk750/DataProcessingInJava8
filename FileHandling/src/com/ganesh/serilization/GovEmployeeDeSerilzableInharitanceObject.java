package com.ganesh.serilization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class GovEmployeeDeSerilzableInharitanceObject {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
       File file = new File("inher.ser");
       FileInputStream fis = new FileInputStream(file);
       ObjectInputStream ois = new ObjectInputStream(fis);
       GovEmployee emp = (GovEmployee)ois.readObject();
       System.out.println("DeSerilized Emp: "+ emp);
	}
	
	//Actual Employee: GovEmployee [areaOfExperience=ECE, rating=3.5 Employee [id=101, name=Ganesh, address=BLR, category=BIS , department=DEV]]

}

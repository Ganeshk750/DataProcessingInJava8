package com.ganesh.serilization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public class SerilizableEmpDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("Ganesh");
		emp.setAddress("BLR");
		emp.setCategory("BIS");
		emp.setDepartment("DEV");
		List<String> listOfTask = Arrays.asList(new String[] {"task1", "task2"});
        emp.setListOfTask(listOfTask);
        Integer [] scores = {2,3,4,5};
        emp.setScores(scores);
		
		File file = new File("first.ser");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		System.out.println("Serilized Emp: " + emp);
		fos.close();
		oos.close();

	}

}

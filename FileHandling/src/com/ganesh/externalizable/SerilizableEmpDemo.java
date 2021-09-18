package com.ganesh.externalizable;

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
	        emp.setCategory("TEST");
	        emp.setDepartment("IT");
	        List<String> listOfTask = Arrays.asList(new String[]{"task1","task2"});
	        emp.setListOfTask(listOfTask);
	        Integer[] scores = {1,2,4,5};
	        emp.setScores(scores);
	        System.out.println("Actual emp - " + emp);

	        File file = new File("extern.ser");
	        FileOutputStream fileOutputStream = new FileOutputStream(file);
	        ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);

	        //storing the object
	        oos.writeObject(emp);

	
	    
	}

}

package com.ganesh.externalizable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserilizedEmployee {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		 File file = new File("extern.ser");
	        FileInputStream fis = new FileInputStream(file);
	        ObjectInputStream ois = new ObjectInputStream(fis);

	        //read the object
	        Employee employee = (Employee) ois.readObject();
	        System.out.println("Deserialized emp - " + employee);

	        fis.close();
	        ois.close();
	}

}

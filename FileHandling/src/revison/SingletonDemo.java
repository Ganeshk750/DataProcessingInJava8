package revison;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonDemo implements Cloneable , Serializable{
	
	private static SingletonDemo singletonRef = null;
	
	private SingletonDemo() {}
	
	public static SingletonDemo createInstamce() {
		if(singletonRef == null) {
			singletonRef = new SingletonDemo();
		}
		return singletonRef;
	}
	
	public static void main(String[] args) throws Exception {
		
		SingletonDemo intialObj = new SingletonDemo();
		SingletonDemo intialObj1 = new SingletonDemo();
		System.out.println("First Object :"+ intialObj.hashCode());
		//System.out.println("Second Object :"+ intialObj1.hashCode());
		
		/* Breaking Singleton */
		
		// 1. Cloneable
		SingletonDemo changedObj = (SingletonDemo)intialObj.clone();
		System.out.println("-----------------------------");
		System.out.println("Initial Object :"+ intialObj.hashCode());
		System.out.println("Changed Object :"+ changedObj.hashCode());
		
		// 2. Serialization
		File file = new File("breakSer.ser");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(intialObj);
		fos.close();
		oos.close();
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		SingletonDemo brokenObje = (SingletonDemo) ois.readObject();
		System.out.println("------------- USING SERIALIZATION ---------------");
		System.out.println("Initial Obj :"+ intialObj.hashCode());
		System.out.println("Broken Obj :"+ brokenObje.hashCode());
	}
	
}

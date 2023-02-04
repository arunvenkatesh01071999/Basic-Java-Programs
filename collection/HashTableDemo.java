package collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Properties;

public class HashTableDemo {

	public static void main(String[] args)throws IOException
	{
		/*Hashtable ht= new Hashtable();
		ht.put(101, "ARUN");
		ht.put(111, "RUN");
		ht.put(121, "ARUNKUMAR");
		
		System.out.println(ht);*/
		
		Properties pr = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\arunk\\eclipse-workspace\\java_programe\\src\\collection\\menu.properties");
		pr.load(fis);
		System.out.println(pr.getProperty("idly"));
		pr.setProperty("idly", "15");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\arunk\\eclipse-workspace\\java_programe\\src\\collection\\menu.properties");
		pr.store(fos, "food rate change");
		
	}

}

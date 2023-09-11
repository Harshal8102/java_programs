import java.util.*;
import java.io.*;
class PropertiesDemo{

	public static void main(String[] args) throws IOException{

		Properties obj = new Properties();

		FileInputStream fobj = new FileInputStream("friends.properties");
		obj.load(fobj);

		String name = obj.getProperty("Harshal");
		System.out.println(name);

		obj.setProperty("Shashi","Biencaps");

		FileOutputStream outObj = new FileOutputStream("friends.properties");
		obj.store(outObj,"Updated by harshal");

	}
}




import java.io.*;
class Demo{

	public static void main(String[] args){

		File obj1 = new File("/home/hsm/java/Class/FileHandling");

		System.out.println(obj1.exists());

		String[] files = obj1.list();

		int count = 0;
		for(String s : files){

			System.out.println(s);

			File f = new File(s);

			if(f.isFile())
				count++;
		}

		System.out.println("Total no. of files : " + count);
	}
}

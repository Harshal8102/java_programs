import java.io.*;
class FileDemo{

	public static void main(String[] args) throws IOException{

		File obj1 = new File("Folder");
		obj1.mkdir();

		File obj2 = new File(obj1,"code.txt");
   		obj2.createNewFile();

	}
}

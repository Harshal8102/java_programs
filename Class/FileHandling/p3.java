//Methods of File class
import java.io.*;
class FileDemo{

	public static void main(String[] args)throws IOException{


		File fobj1 = new File("Incubator.txt");

		fobj1.createNewFile();

		System.out.println(fobj1.getName());   //Incubator

		System.out.println(fobj1.getParent());  //null

		System.out.println(fobj1.getParentFile()); //null

		System.out.println(fobj1.getPath());       //short path

		System.out.println(fobj1.getAbsolutePath());     //fullpath

		System.out.println(fobj1.canRead());       //bool  canRead()

		System.out.println(fobj1.canWrite());       //bool  canWrite()

		System.out.println(fobj1.isDirectory());       //bool  isDirectory()

		System.out.println(fobj1.isFile());       //bool  isFile()

		System.out.println(fobj1.isHidden());       //bool  isHidden()

		System.out.println(fobj1.lastModified());       //long  lastModified()

		System.out.println(fobj1.canRead());       //bool  canRead()
		
		System.out.println(fobj1.exists());      //bool exists()

		System.out.println(fobj1.delete());       //bool  delete()

	}

}




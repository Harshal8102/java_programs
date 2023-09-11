import java.io.*;
class FileDemo{

	public static void main(String[] args)throws IOException{

		File fobj = new File("File");   //not create new file
		
		fobj.mkdir();  //create new directory

	//	fobj.createNewFile();   //create File


		File fobj2 = new File("File","file2.txt");    //2n Constructor  (folder,file)

		fobj2.createNewFile();            //if first instruction is for filecreation then it creates file or if first instruction
						  //is for directory it creates direction
		fobj2.mkdir();


		File fobj3 = new File(fobj,"code1.txt");   //3rd Constructor  (folder,file)

		fobj3.createNewFile();

		System.out.println(fobj3.getParent());
	
		System.out.println(fobj3.getParentFile());

	


	}
}

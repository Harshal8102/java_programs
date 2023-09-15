//for writing in file

import java.io.*;
class FileDemo{
	public static void main(String[] args)throws IOException{

		FileWriter fw = new FileWriter("Incubator.txt");  //create new file if not

		fw.write("Flutter");
		fw.write("Backend");
		fw.write("Frontend");

		fw.close();

	//	fw.write("develop");      ioexception
	}
}




import java.io.*;
class FileDemo{

	public static void main(String[] args)throws IOException{

		File f = new File("Incubator.txt");

		FileWriter fw = new FileWriter(f,true);

		fw.write("Testing \n");
		fw.write("Devops\n");
		fw.write("salesforce\n");

		fw.close();
	}
}

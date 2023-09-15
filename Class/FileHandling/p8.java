
import java.io.*;
class FileReaderDemo{

	public static void main(String[] args)throws IOException{

		FileInputStream fis = new FileInputStream("Incubator.txt");

		FileDescriptor fd = fis.getFD();

		FileReader fr = new FileReader(fd);            //3rd constructor of FileReader

		int data = fr.read();

		while(data != -1){

			System.out.print((char)data);
			data = fr.read();
		}

		System.out.println(fd.in);
		System.out.println(fd.out);
		System.out.println(fd.err);



		fr.close();
	}
}



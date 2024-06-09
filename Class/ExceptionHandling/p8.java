
import java.io.*;
class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		System.out.println(str);

		 	br.close();		
		try{
			String str1 = br.readLine();
			System.out.println(str1);
	
		}catch(IOException obj){
			System.out.println("std in closed");
		}
	}
}

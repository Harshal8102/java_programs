
import java.io.*;
class Demo{

	void getData()throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int data = 0;

		try{
			data = Integer.parseInt(br.readLine());
		}catch(NumberFormatException obj){

			System.out.println(obj);
			obj.printStackTrace();
		}

		System.out.println(data);
	}

	public static void main(String[] args)throws IOException{
		
		System.out.println("Start main");
		Demo obj = new Demo();
		obj.getData();
		System.out.println("End main");
	}
}


import java.io.*;
class Demo{

	void getData()throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int data = 0;
		try{
			data = Integer.parseInt(br.readLine());

		}catch(NumberFormatException obj){

			System.out.println("please enter integer data");
			try{
				data = Integer.parseInt(br.readLine());

			}catch(NumberFormatException obj1){

				System.out.println("please enter integer data");
				data = Integer.parseInt(br.readLine());
			}
		}

		System.out.println(data);
	}

	public static void main(String[] args)throws IOException{

		Demo obj = new Demo();
		obj.getData();

	}
}

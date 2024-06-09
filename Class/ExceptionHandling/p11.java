import java.io.*;
class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int data = 0;

		try{
			data = Integer.parseInt(br.readLine());
		}catch(IllegalArgumentException obj){     			//child
		
			System.out.println(obj);
			System.out.println("exception handle 1");

		}catch(RuntimeException obj){					//parent
		
			System.out.println("Exception handle 2");
		}
	
		System.out.println(data);
	}
}

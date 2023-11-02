
import java.io.*;
class Recurrsion{

	int fibo(int num){

		if(num <= 2)
			return num-1;
		
		return fibo(num-2) + fibo(num-1);
	}

	public static void main(String[] args)throws IOException{

		Recurrsion obj = new Recurrsion();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter number");
		int num = Integer.parseInt(br.readLine());

		System.out.println(obj.fibo(num));
	}
}

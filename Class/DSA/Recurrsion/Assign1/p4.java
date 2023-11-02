//print length of digits in a number
import java.io.*;
class Recurrsion{

	int lengthOfDigits(int num){

		if(num == 0)
			return 0;

		int count = 1;

		return count + lengthOfDigits(num/10);

	}

	public static void main(String[] args)throws IOException{

		Recurrsion obj = new Recurrsion();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter number");
		int num = Integer.parseInt(br.readLine());

		System.out.println(obj.lengthOfDigits(num));
	}
}

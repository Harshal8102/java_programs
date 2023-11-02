//determine whether a given positive integer is a composite number or not
import java.io.*;
class Recurrsion{

	/*boolean isCompositeNumber(int num){

		if(num <= 1)
			return false;

		for(int i=2; i<=num/2; i++){

			if(num%i == 0)
				return true;
		}

		return false;
	}*/

	boolean isCompositeNumber(int num,int i){

		if(num <= 1)
			return false;

		if(i > num/2)
			return false;

		if(num % i == 0)
			return true;

		return isCompositeNumber(num,i+1);
	}
		

	public static void main(String[] args)throws IOException{

		Recurrsion obj = new Recurrsion();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter number");
		int num = Integer.parseInt(br.readLine());

		if(obj.isCompositeNumber(num,2))
			System.out.println(num + " is composite number");
		else
			System.out.println(num + " is not composite");
	}
}

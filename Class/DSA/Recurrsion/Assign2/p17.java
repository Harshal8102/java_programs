//calculate & print the sum of the first N triangular numbers.

import java.io.*;
class Recurrsion{

	/*int sumOfTriangularNumber(int num){

		int sum = 0;

		for(int i=1; i<=num; i++){

			int tri = (i*(i+1)) / 2;
			sum += tri;
		}

		return sum;
	}*/
	int sumOfTriangularNumber(int num,int i){

		if(i > num)
			return 0;

		return ((i*(i+1))/2) + sumOfTriangularNumber(num,i+1);
	}

	public static void main(String[] args)throws IOException{

		Recurrsion obj = new Recurrsion();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter number");
		int num = Integer.parseInt(br.readLine());

		System.out.println(obj.sumOfTriangularNumber(num,1));
	}
}

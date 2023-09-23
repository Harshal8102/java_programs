//Replace all 0's with 5

import java.io.*;
class Demo{

	static int replaceZero(int n){

		int ans = 0;
		while(n != 0){

			int rem = n % 10;
			ans = ans * 10 + rem;
			n /= 10;
		}

		return ans;
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter an integer");
		int n = Integer.parseInt(br.readLine());

		int reverse = 0;
		while(n != 0){

			int rem = n % 10;
			if(rem == 0){
				rem = 5;
			}
			reverse = reverse * 10 + rem;
			n /= 10;
		}

		System.out.println(replaceZero(reverse));

	}
}

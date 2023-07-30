/* Program to print a series of prime numbers from entered range.(take start and end number from a user) */


import java.io.*;
class c2w{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Starting number:");
		int st = Integer.parseInt(br.readLine());

		System.out.println("Enter Last number:");
		int lt = Integer.parseInt(br.readLine());

		for(int i=st; i<=lt; i++){

			int count = 0;
			int n = i;

			for(int j=1 ; j<=n; j++){

				if(n%j==0){
					count++;
				}
			}

			if(count==2){
				System.out.print(n + "  ");
			}
		}
		System.out.println();
	}
}


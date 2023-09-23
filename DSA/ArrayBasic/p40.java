

import java.util.*;
class Demo{

	static char findWinnerCountry(int A[],int B[],int n){

		int a = 0;
		int b = 0;

		for(int i=0; i<n ; i++){

			if(A[i] > B[i])
				a++;
			else if(B[i] > A[i])
				b++;
		}

		if(a == b){
			return 'C';
		}
	
		if(a > b)
			return 'A';
	
		return 'B';
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter soldiers of A country");
		int n = sc.nextInt();
		int A[] = new int[n];
		for(int i=0; i<n; i++){
			A[i] = sc.nextInt();
		}
		System.out.println("Enter soldiers of B country");
		int B[] = new int[n];
		for(int i=0; i<n; i++){
			B[i] = sc.nextInt();
		}

   		char ch = findWinnerCountry(A,B,n);
		if(ch == 'C')
			System.out.println("No one winner, both die");
		else
			System.out.println("Winner country is : " + ch);	
	}
}

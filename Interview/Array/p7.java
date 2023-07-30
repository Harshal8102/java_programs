// Strong number ==> eg. 65 =>   if((6! + 5!) == 65) 

import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);	

		System.out.println("Enter the array size ");

		int size = sc.nextInt();

		int arr[] = new int[size];

		for(int i=0; i<arr.length; i++){
		
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++){

			int n = arr[i];
			int sum = 0;
			while(n != 0){

				int rem = n % 10;
				int fact = 1;
				for(int j=rem; j>0; j--){
					
					fact = fact * j;
				}

				sum = sum + fact;
				n = n / 10;
			}

			if(sum == arr[i]){

				System.out.println("Strong number is " + arr[i]);
			}
		}
	}
}


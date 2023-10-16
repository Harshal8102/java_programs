//count Tier of abc

import java.util.*;
class Demo{

	static int countTier(char a[],int n){

		int countA=0,pair=0,tier=0;

		for(int i=0; i<n; i++){

			if(a[i] == 'a')
				countA++;
			else if(a[i] == 'b')
				pair += countA;
			else if(a[i] == 'c')
				tier += pair;
		}

		return tier;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		char arr[] = new char[n];

		for(int i=0; i<n; i++){

			arr[i] = sc.next().charAt(0);
		}

		System.out.println(countTier(arr,n));
	}
}


//count pairs with given sum

import java.util.*;
class Demo{

	static int countPairs(int arr[],int k){

		int count = 0;
		
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]+arr[j]==k)
					count++;
			}
		}

		return count;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println("Enter vakue of k");
		int k = sc.nextInt();

		System.out.println(countPairs(arr,k));
	}
}


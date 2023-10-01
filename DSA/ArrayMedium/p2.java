//Pythagorean triplet

import java.util.*;
class Demo{

	static boolean isPythaTriplet(int a[],int n){

		Arrays.sort(a);
		for(int i=0; i<n; i++)
			a[i] = a[i]*a[i];

		for(int i=n-1; i>= 2; i--){

			int l = 0,r = i-1;

			while(l < r){
				if(a[l] + a[r] == a[i])
					return true;
				if(a[l] + a[r] < a[i])
					l++;
				else
					r--;
			}
		}
		return false;
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		 if(isPythaTriplet(arr,n))
			 System.out.println("Yes");
		 else
			 System.out.println("No");
	}
}

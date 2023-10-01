//Key pair

import java.util.*;
class Demo{

	static String isKeyPair(int a[],int n,int x){

		Arrays.sort(a);

		int st = 0,en=n-1;

		while(st<en){
			if(a[st] + a[en] == x)
				return "Yes";
			if(a[st] + a[en] > x)
				en--;
			else
				st++;
		}

		return "No";
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println("enter value of x");
		int x = sc.nextInt();

		System.out.println(isKeyPair(arr,n,x));
	}
}

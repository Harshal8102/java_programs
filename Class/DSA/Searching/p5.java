//find peak element using binary search

import java.io.*;
class BinarySearch{

	int searchElement(int a[]){

		int start = 0,end = a.length-1;

		int ans = Integer.MIN_VALUE;
		while(start <= end){

			int mid = (start+end)/2;

			if(a[mid] > ans)
				ans = a[mid];

			if(a[mid] > 
		}

		return ans;
	}

	public static void main(String[] args)throws IOException{

		BinarySearch obj = new BinarySearch();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter array size & elements");
		int n = Integer.parseInt(br.readLine());
		int a[] = new int[n];

		for(int i=0; i<n; i++)
			a[i] = Integer.parseInt(br.readLine());

		System.out.println(obj.searchElement(a));
	}
}

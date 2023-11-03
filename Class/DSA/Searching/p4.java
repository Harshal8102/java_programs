//find the element closest to a given target in a sorted array

import java.io.*;
class BinarySearch{

	int searchElement(int a[],int target){

		int start = 0,end = a.length-1;

		int ans = Integer.MAX_VALUE;
		while(start <= end){

			int mid = (start+end)/2;

			if(Math.abs(a[mid]-target)<ans){

				ans = a[mid];
				
			}
			if(a[mid] < target)
				start = mid+1;
			else
				end = mid-1;
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

		System.out.println("enter element to search");
		int target = Integer.parseInt(br.readLine());

		System.out.println(obj.searchElement(a,target));
	}
}

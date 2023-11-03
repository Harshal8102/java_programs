//binary search using recursion as well as while loop

import java.io.*;
class BinarySearch{

	/*int searchElement(int a[],int s){

		int start = 0,end = a.length-1;

		while(start <= end){

			int mid = (start+end)/2;

			if(a[mid] == s)
				return mid;
			else if(a[mid] < s)
				start = mid+1;
			else
				end = mid-1;
		}

		return -1;
	}*/

	int searchElement(int a[],int s,int start,int end){

		if(start > end)
			return -1;

		int mid = (start +end)/2;

		if(a[mid] == s)
			return mid;

		if(a[mid] < s)
			return searchElement(a,s,mid+1,end);
		else
			return searchElement(a,s,start,mid-1);
	}


	public static void main(String[] args)throws IOException{

		BinarySearch obj = new BinarySearch();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter array size & elements");
		int n = Integer.parseInt(br.readLine());

		int arr[] = new int[n];

		for(int i=0; i<n; i++){

			arr[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Enter element to search");
		int s = Integer.parseInt(br.readLine());

		System.out.println(obj.searchElement(arr,s,0,n-1));
	}
}

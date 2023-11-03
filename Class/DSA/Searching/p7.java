//find index where given target element should be insertedin sorted array

import java.io.*;
class BinarySearch{

	int searchElement(int a[],int s){

		int start = 0,end = a.length-1;

		while(start <= end){

			int mid = (start+end)/2;

			if(a[mid] == s){

				return mid;
			}else if(a[mid] < s)
				start = mid+1;
			else
				end = mid-1;
		}

		return start;
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
		int s = Integer.parseInt(br.readLine());
		System.out.println(obj.searchElement(a,s));
	}
}

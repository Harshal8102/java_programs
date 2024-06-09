//given 2d matrix where each row & each column is sorted in ascending order.
//write a program to search in matrix to determine if a target element is present in the matrix

import java.io.*;
class BinarySearch{

	boolean searchElement(int a[][],int s){

		for(int i=0; i<a.length; i++){

			int start = 0,end = a[i].length-1;

			while(start <= end){

				int mid = (start+end)/2;

				if(a[i][mid] == s){
					return true;
					
				}else if(a[i][mid] < s)
					start = mid+1;
				else
					end = mid-1;
			}
		}

		return false;
	}

	public static void main(String[] args)throws IOException{

		BinarySearch obj = new BinarySearch();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[][] = new int[][]{{1,4,7,11},{2,5,8,12},{3,6,9,16},{10,13,14,17}};

		System.out.println("enter element to search");
		int s = Integer.parseInt(br.readLine());

		System.out.println(obj.searchElement(arr,s));
	}
}

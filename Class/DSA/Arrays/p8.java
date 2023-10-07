//Build an array leftMax of size n. 

import java.util.*;
class Demo{

	public static void main(String[] args){

		int arr[] = {-3,6,2,4,5,2,8,-9,3,1};
		int n = 10;

		int leftMax[] = new int[n];
		leftMax[0] = arr[0];

		for(int i=1; i<n; i++){

			if(leftMax[i-1] > arr[i])
				leftMax[i] = leftMax[i-1];
			else
				leftMax[i] = arr[i];
		}

		for(int x : leftMax)
			System.out.print(x + "   ");
		System.out.println();
	}
}

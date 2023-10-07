
//Build an array rightMax of size n. 

import java.util.*;
class Demo{

	public static void main(String[] args){

		int arr[] = {-3,6,2,4,5,2,8,-9,3,1};
		int n = 10;

		int rightMax[] = new int[n];
		rightMax[n-1] = arr[n-1];

		for(int i=n-2; i>=0; i--){

			if(rightMax[i+1] > arr[i])
				rightMax[i] = rightMax[i+1];
			else
				rightMax[i] = arr[i];
		}

		for(int x : rightMax)
			System.out.print(x + "   ");
		System.out.println();
	}
}

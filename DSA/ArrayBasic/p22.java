
import java.util.*;
class Demo{

	static void findSmallest(int arr[]){

		int min1 = Integer.MAX_VALUE;
		int min2 = arr[0];

		for(int x : arr){

			if(min1 > x){
				min2 = min1;
				min1 = x;
			}

			if(min1 < min2 && min2 > x && min1!=x){
				min2 = x;
			}
		}

		System.out.println(min1 + " & " + min2 + " are respectively smallest & second smallest element in an array");
	}

	public static void main(String[] args){

		int arr[] = {1,2,1,3,6,7};
		int n = 6;

		findSmallest(arr);
	}
}


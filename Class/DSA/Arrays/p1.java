//Given array of size n. count no. of atleast 1 element greater than itself.

import java.util.*;
class Demo{

	static int countOf(int a[],int n){

		int count = 0;

		/*brute force
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(a[i] < a[j]){
					count++;
					break;
				}
			}
		}*/

		/*opt
		Arrays.sort(a);
		for(int i=0; i<n; i++){
			if(a[i] < a[n-1])
				count++;
		}*/

		//Optimized
		int max = Integer.MIN_VALUE;
		for(int x : a){
			if(x > max){
				max = x;
				count = 1;
				continue;
			}else if(max == x){
				count++;
			}
		}

		return n-count;
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println(countOf(arr,n));
	}
}

//first element to occur k times


import java.util.*;
class Demo{

	static int findElement(int arr[],int n,int k){

		Arrays.sort(arr);

		int count = 1;

		for(int i=0; i<n-1; i++){

			if(arr[i] == arr[i+1]){
				count++;
			}else{
				if(count >= k){
					return arr[i];
				}
				count = 1;
			}

			if(count>=k && i==n-2){
				return arr[n-2];
			}
		}

		return -1;
	}

	public static void main(String[] args){

		int arr[] = {7,5,4,3,2,7,7};
		int n = 7;
		int k = 2;

		System.out.println(findElement(arr,n,k));
	}
}

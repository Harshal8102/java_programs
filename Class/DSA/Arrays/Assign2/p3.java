
//Largest subarray of 0's & 1's

import java.util.*;
class Demo{

	static int findLargestSum(int a[],int n){

		int max_len=0,start=0,end=0;
/*
		for(int i=0; i<n; i++){

			int sum = 0;

			for(int j=i; j<n; j++){

				if(a[j] == 0)
					sum += -1;
				else
					sum += 1;

				if(sum == 0 && max_len < j-i+1){
					max_len = j-i+1;
					start = i;
					end = j;
				}
			}
		}*/

		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

		int sum=0;
		for(int i=0; i<n; i++){

			a[i] = (a[i] == 0) ? -1 : 1;
		}

		for(int i=0; i<n; i++){

			sum += a[i];

			if(sum == 0){
				max_len = i+1;
				end = i;
			}

			if(hm.containsKey(sum)){
				if(max_len < i - hm.get(sum)){
					max_len = i-hm.get(sum);
					end = i;
				}
			}else{
				hm.put(sum,i);
			}
		}

		start = end - max_len+1;

		System.out.println(start + " to " + end);

		return max_len;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println(findLargestSum(arr,n));
	}
}

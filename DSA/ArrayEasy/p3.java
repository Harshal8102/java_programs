//find duplicates in an array

import java.util.*;
class Demo{

	static void findDuplicate(int arr[],int n){

		Set<Integer> ll = new TreeSet<Integer>();

		Arrays.sort(arr);
		for(int i=0; i<n-1; i++){
			if(arr[i] == arr[i+1]){
				ll.add(arr[i]);
			}
		}

		if(ll.size()>0){
			System.out.println(ll);
		}else{
			System.out.println(-1);
		}
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		findDuplicate(arr,n);
	}
}


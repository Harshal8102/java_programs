//Given array of size n. return count of pairs (i,j) with a[i] + a[j] = k

import java.util.*;
class Demo{

	static int countOfPairs(int a[],int n,int k){
		
		int count = 0;
		
		/*for(int i=0; i<n-1; i++){

			for(int j=i+1; j<n; j++){

				if(a[i] + a[j] == k)
					count++;
			}
		}

		return count*2;*/
		ArrayList<Integer> al = new ArrayList<>();
		for(int x : a)
			al.add(x);

		for(int i=0 ; i<n; i++){

			if(al.contains(k-a[i]) && al.indexOf(a[i]) != i){
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println("Enter value of k");
		int k = sc.nextInt();

		System.out.println(countOfPairs(arr,n,k));
	}
}

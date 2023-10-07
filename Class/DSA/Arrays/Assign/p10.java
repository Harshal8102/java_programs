//Leaders in an array

import java.util.*;
class Demo{

	static void findLeaders(int a[],int n){

		ArrayList<Integer> al = new ArrayList<>();

		int max = a[n-1];

		al.add(a[n-1]);
		for(int i=n-2; i>=0; i--){

			if(a[i] > max)
				al.add(a[i]);

			if(a[i] > max)
				max = a[i];
		}

		Collections.sort(al,Collections.reverseOrder());

		System.out.println(al);
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<n; i++){

			arr[i] = sc.nextInt();
		}

		findLeaders(arr,n);
	}
}

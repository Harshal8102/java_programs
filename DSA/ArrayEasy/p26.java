//Leaders in an Array

import java.util.*;
class Demo{

	static Object[] findLeaders(int a[],int n){

		int max = a[n-1];
		ArrayList<Integer> al = new ArrayList<>();
		al.add(max);

		for(int i=n-2; i>=0; i--){

			if(max < a[i]){
				al.add(a[i]);
				max = a[i];
			}
		}

		Collections.sort(al,Collections.reverseOrder());

		return al.toArray();
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		Object[] ans = findLeaders(arr,n);

		for(Object x : ans)
			System.out.print(x + "   ");
		System.out.println();
	}
}

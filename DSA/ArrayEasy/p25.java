//Even and Odd

import java.util.*;
class Demo{
	static int setEvenOddIndex(int a[],int n){

		int e = 0;
		int o = 0;
		int temp;

		for(int i=0; i<n; i++){

			if(a[i]%2!=0 && i%2==0)
				e = i;
			if(a[i]%2==0 && i%2!=0)
				o = i;

			if(a[e]%2!=0 && a[o]%2==0){
				temp = a[e];
				a[e] = a[o];
				a[o] = temp;
			}
		}

		for(int i=0; i<n ;i++){

			if(i%2==0 && a[i]%2!=0){
				return 0;
			}
			if(i%2!=0 && a[i]%2==0)
				return 0;
		}
		return 1;
	}
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println(setEvenOddIndex(arr,n));
		
	}
}

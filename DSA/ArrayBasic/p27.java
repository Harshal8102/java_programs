//count pair sum

import java.util.*;
class Demo{

	static int countPairSum(int arr1[],int arr2[],int m,int n,int sum){

		int st = 0;
		int en = n-1;

		int count = 0;
		while(st<m && en>=0){

			if(arr1[st] + arr2[en] == sum){
				count++;
				st++;
				en--;
			}
			if(st<m && en>=0 && arr1[st]+arr2[en] < sum){
				st++;
			}else if(st<m && en>=0 && arr1[st]+arr2[en] > sum){
				en--;
			}

		}

		return count;
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array 1");
		int m = sc.nextInt();
		int arr1[] = new int[m];
		for(int i=0; i<m; i++){
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter array 2");
		int n = sc.nextInt();
		int arr2[] = new int[n];
		for(int i=0; i<n; i++){
			arr2[i] = sc.nextInt();
		}
		System.out.println("enter sum");
		int sum = sc.nextInt();

		System.out.println(countPairSum(arr1,arr2,m,n,sum));
	}
}


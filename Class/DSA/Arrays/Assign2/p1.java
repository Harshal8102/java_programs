//Subarray with given sum

import java.util.*;
class Demo{

	static ArrayList<Integer> findFirstLastIndex(int a[],int n,int s){

		ArrayList<Integer> al = new ArrayList<>();

		/*for(int i=0; i<n; i++){

			int sum = 0;

			for(int j=i; j<n; j++){

				sum += a[j];
				if(sum == s){
					al.add(i+1);
					al.add(j+1);
					return al;
				}
			}
		}*/

		int i=0,j=-1;

		int sum = 0;
		while(j < a.length){

			if(sum == s){
				al.add(i+1);
				al.add(j+1);
				return al;
				
			}else if(sum < s){
				j++;
				sum += a[j];
			}else{
				sum -= a[i];
				i++;
			}
		}

		al.add(-1);
		return al;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println("enter sum value");
		int s = sc.nextInt();


		System.out.println(findFirstLastIndex(arr,n,s));
	}
}


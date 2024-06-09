//Add 1 to array


import java.util.*;
class Demo{

	static int[] addOne(int a[],int n){

		int index = n-1;

		while(index >= 0 && a[index] == 9){
			a[index] = 0;
			index--;
		}

		if(index < 0){
			int ans[] = new int[n+1];
			ans[0] = 1;
			return ans;
		}else{
			a[index] += 1;
		}
		return a;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}

		int [] ans = addOne(arr,n);

		for(int x : ans)
			System.out.print(x + "  ");

		System.out.println();
	}
}

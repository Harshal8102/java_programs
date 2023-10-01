//product Array puzzle

import java.util.*;
class Demo{

	static int[] productPuzzle(int a[],int n){
		int mul = 1;
		for(int i=0; i<n; i++){
			if(a[i] != 0)
			mul *= a[i];
		}

		int p[] = new int[n];

		for(int i=0; i<n; i++){
			
			if(a[i] == mul)
				p[i] = mul-a[i];
			else{
				try{
					p[i] = mul / a[i];
				}catch(ArithmeticException obj){
					p[i] = mul - a[i];
				}
			}
		}
	
		return p;
	}
		
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		int ans[] = productPuzzle(arr,n);

		for(int x : ans)
			System.out.print(x + "  ");
		System.out.println();
	}
}

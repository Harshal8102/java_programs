//Given array A of element B
//find min no. of swaps required to bring all the element <= B together:wq
//


import java.util.*;
class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int a[] = new int[n];

		for(int i=0; i<n; i++){

			a[i] = sc.nextInt();
		}

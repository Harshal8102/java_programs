//Number of occurances
import java.util.*;
class Demo{

	static int noOfOcc(int arr[],int n,int k){

		int count=0;

		for(int i=0; i<n/2; i++){
			if(arr[i] == k)
				count++;

			if(arr[(n/2)+i] == k)
				count++;
		}

		if(n % 2 != 0 )
			if(arr[arr.length-1] == k) 
				count++;
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

		System.out.println(niOfOcc(arr,n,k));
	}
}

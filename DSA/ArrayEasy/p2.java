
import java.util.*;
class Demo{

	static void sortArray(int arr[],int n){

		int l = 0,mid = 0, hi = n-1;
		int temp = 0;

		while(mid<=hi){

			switch(arr[mid]){

				case 0 : temp = arr[mid];
					 arr[mid] = arr[l];
					 arr[l] = temp;
					 l++;
					 mid++;
					 break;

				case 1 : mid++;
					 break;
				case 2 : temp = arr[mid];
					 arr[mid] = arr[hi];
					 arr[hi] = temp;
					 hi--;
					 break;
			}
		}
	}
		
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		sortArray(arr,n);

		for(int x : arr)
			System.out.print(x + "   ");

		System.out.println();
	}
}

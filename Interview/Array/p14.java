
import java.util.*;

class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for(int i=0; i<arr.length; i++){

			arr[i] = sc.nextInt();
		}
		System.out.println("Enter element to remove:");
		int x = sc.nextInt();

		int ans[] = new int[arr.length-1];
		int j = 0;
		for(int i=0 ; i<arr.length; i++){

			if(arr[i] != x){

				ans[j++] = arr[i];
			}
		}
		
		for(int y : ans){
			System.out.println( y );
		}
		
	}
}


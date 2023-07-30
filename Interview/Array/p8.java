
import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);	

		System.out.println("Enter the array size ");

		int size = sc.nextInt();

		int arr[] = new int[size];

		for(int i=0; i<arr.length; i++){
		
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length; i++){

			for(int j=0; j<arr.length-1; j++){

				if(arr[j] > arr[j+1]){

					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("array in ascending order");
		for(int x : arr){

			System.out.println(x);
		}
	
	}
}


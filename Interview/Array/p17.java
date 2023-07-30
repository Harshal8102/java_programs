
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
		System.out.println("Enter the number:");
		int x = sc.nextInt();

		for(int i=0; i<arr.length-1; i++){

			for(int j=i+1; j<arr.length;j++){

				if( x == arr[i] + arr[j]){

					System.out.println("index " + i + ", index " + j);
				}
			}
		}	
	}
}


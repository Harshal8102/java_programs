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
		System.out.println("Even numbers are");
		for(int x : arr){

			if(x % 2 == 0){

				System.out.println(x);
			}
		}
	}
}


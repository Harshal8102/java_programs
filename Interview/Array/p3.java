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
		int max = arr[0];	

		for(int x : arr){

			if(x > max){

				max = x;
			}
		}

		System.out.println("max number is : " + max);
	}
}


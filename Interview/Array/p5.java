
import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);	

		System.out.println("Enter the array size ");

		int size = sc.nextInt();

		int arr[] = new int[size];

		int sum = 0;

		for(int i=0; i<arr.length; i++){
		
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}

		System.out.println("sum of elements is : " + sum);
	}
}


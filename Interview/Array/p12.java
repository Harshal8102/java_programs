
import java.util.*;

class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size");
		int size = sc.nextInt();

		int arr[] = new int[size];
		int oddsum = 0;
		int evensum = 0;

		for(int i=0; i<arr.length; i++){

			arr[i] = sc.nextInt();
			if(arr[i] % 2 == 0 ){

				evensum = evensum + arr[i];
			}else{
				oddsum = oddsum + arr[i];
			}
		}
		
		System.out.println("Odd numbers sum : " + oddsum);
		System.out.println("Even numbers sum : " + evensum);
	}
}



import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[8];

		for(int i=0; i<arr.length; i++){

			arr[i] = sc.nextInt();
		}

		for(int i=0; i<arr.length; i++){

			for(int j=0; j<arr.length-1; j++){

				if(arr[j] < arr[j+1]){

					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
			
		for(int x : arr){
			System.out.println(x + "   ");
		}
	}
}



import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);	

		System.out.println("Enter the array size ");

		int size = sc.nextInt();

		int arr[] = new int[size];
		int freq[] = new int[size];

		for(int i=0; i<arr.length; i++){
		
			arr[i] = sc.nextInt();
		}
		int visited = -1;
		
		for(int i=0; i<arr.length; i++){
			int count = 1;

			for(int j=i+1; j<arr.length; j++){

				if(arr[i] == arr[j]){

					count++;
					arr[j] = visited;
				}
			}
			freq[i] = count;
		}
		for(int i=0;i<arr.length; i++){

			if(arr[i] != visited){

				System.out.println("frequency of " + arr[i] + " is " + freq[i]);
			}
		}
	}
}


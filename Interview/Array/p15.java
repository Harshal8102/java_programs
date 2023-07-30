
import java.util.*;

class demo{

	static int [] removeDuplicate(int arr[]){

		int temp[] = new int[arr.length];
		int j = 0;
		
		for(int i=0; i < arr.length-1; i++){

			if(arr[i] != arr[i+1]){

				temp[j++] = arr[i];
			}
		}

		temp[j] = arr[arr.length-1];

		int ans[] = new int[j+1];

		for(int i=0; i <= j; i++){

			ans[i] = temp[i];
		}

		return ans;
	}	

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for(int i=0; i<arr.length; i++){

			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		int ans[] = removeDuplicate(arr);

		for(int x : ans){

			System.out.println(x);
		}
	}
}


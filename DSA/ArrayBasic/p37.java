//immediate smaller Element
import java.util.*;
class Demo{

	static void makeSmallElement(int arr[],int n){

		for(int i=0; i<n-1; i++){

			if(arr[i] > arr[i+1]){
				arr[i] = arr[i+1];
			}else{
				arr[i] = -1;
			}
		}

		arr[n-1] = -1;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array");
		int m = sc.nextInt();
		int arr[] = new int[m];
		for(int i=0; i<m; i++){
			arr[i] = sc.nextInt();
		}

		makeSmallElement(arr,m);

		for(int x : arr)
			System.out.print(x + "  ");
		System.out.println();

	}
}

		

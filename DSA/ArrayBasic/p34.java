
import java.util.*;
class Demo{

	static int minProduct(int arr[],int k){

		Arrays.sort(arr);

		int mul = 1;
		for(int i=0; i<k; i++){
			mul *= arr[i];
		}

		return mul % ;//(109 + 7); 
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array");
		int m = sc.nextInt();
		int arr[] = new int[m];
		for(int i=0; i<m; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter value of k");
		int k = sc.nextInt();

		System.out.println(minProduct(arr,k));
	}
}

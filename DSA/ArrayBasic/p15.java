import java.util.*;
class Demo{

	static int sumOfDistinctE(int arr[],int n){

		Arrays.sort(arr);
		int sum = arr[0];

		for(int i=0; i<n-1; i++){

			if(arr[i] != arr[i+1]){

				sum += arr[i+1];
			}
		}

		return sum;
	}

		
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array1 size & elements");
		int n1 = sc.nextInt();
		int A[] = new int[n1];
		for(int i=0; i<n1; i++){

			A[i] = sc.nextInt();
		}
		
		System.out.println(sumOfDistinctE(A,n1));
	}
}

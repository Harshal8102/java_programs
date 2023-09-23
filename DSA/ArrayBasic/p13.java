
import java.util.*;
class Demo{

	static int findUnique(int arr[],int n, int k){

		/*int visited = 0;
		for(int i=0; i<n; i++){

			int x = arr[i];

			if(arr[i] != visited){

				int count = 0;

				for(int j=i; j<n; j++){

					if(x == arr[j]){
						count++;
						arr[j] = visited;
					}
				}

				if(count % k != 0){
					return x;
				}
			}
		}*/
		Arrays.sort(arr);
		int count = 1;
		for(int i=0; i<n-1; i++){

			if(arr[i] == arr[i+1]){
				count++;
			}else{
				if(count % k != 0){
					return arr[i];
				}
				count = 1;
			}
		}
		
		return arr[n-1];
	}
				
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array1 size & elements");
		int n1 = sc.nextInt();
		int A[] = new int[n1];
		for(int i=0; i<n1; i++){

			A[i] = sc.nextInt();
		}
		
		System.out.println("enter value of k");
		int k = sc.nextInt();

		System.out.println("unique element : " + findUnique(A,n1,k));
	}
}


import java.util.*;
class Demo{

	static int maxRepeat(int arr[],int n,int k){

		int max = Integer.MIN_VALUE;
		Arrays.sort(arr);
		int count = 1;
		int maxE = arr[0];
		for(int i=0; i<n-1; i++){

			if(arr[i] == arr[i+1]){
				count++;
			}else{
				if(count > max){
					max = count;
					maxE = arr[i];
				}
				count = 1;
			}

			if(count>max && i==n-2){
				max = count;
				maxE = arr[i];
			}
		}
		return maxE;
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

		System.out.println("Max repeating no. : " + maxRepeat(A,n1,k));
	}
}

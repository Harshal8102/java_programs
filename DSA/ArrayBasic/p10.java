
import java.util.*;
class Demo{

	static int maxOddSum(int arr[],int n){

		int min_odd = Integer.MAX_VALUE;

		boolean odd = false;
		int sum = 0;

		for(int i=0; i<n; i++){

			if(arr[i] > 0){
				sum += arr[i];
			}

			if(arr[i] %2 != 0 ){

				odd = true;
				if(min_odd > Math.abs(arr[i])){
					min_odd = Math.abs(arr[i]);
				}
			}
		}
		if(sum%2==0 && (odd==false)){
			return -1;
		}

		if(sum % 2 == 0){
			return sum - min_odd;
		}

		return sum;
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++){

			arr[i] = sc.nextInt();
		}

		System.out.println(maxOddSum(arr,n));
	}
}


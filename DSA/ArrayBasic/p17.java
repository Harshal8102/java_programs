
import java.util.*;
class Demo{

	static String findSubArray(int arr[] ,int n, int sum){

		int st=0;
		int en = 0;
		int s = 0;

		if( sum == 0){
			return "no SubArray found";
		}


		while(st<=en){

			if(s < sum){

				s += arr[en++];
			
			}
		
			if(s > sum){
				s -= arr[st];
				st++;
			}
			if(sum == s){
				break;
			}
		}

			
		if(s == sum)
			return "sum of elements between indeces " + st + " & " + (en-1);
			
		return " -1";
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter sum");
		int sum = sc.nextInt();

		System.out.println(findSubArray(arr,n,sum));
	}
}

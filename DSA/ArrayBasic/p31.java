
import java.util.*;
class Demo{

	static int maxArrayEI(int arr[],int m){

		int sum = 0;
		Arrays.sort(arr);

		for(int i=m-1; i>=0; i--){
			sum += (arr[i]*i);
		}

		return sum % (109+7);
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array");
		int m = sc.nextInt();
		int arr[] = new int[m];
		for(int i=0; i<m; i++){
			arr[i] = sc.nextInt();
		}

		System.out.println(maxArrayEI(arr,m));
	}
}

		

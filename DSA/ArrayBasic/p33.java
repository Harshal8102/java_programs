
import java.util.*;
class Demo{

	static int[] pendulumArrangement(int arr[],int m){

		Arrays.sort(arr);
		int mid = (m-1)/2;
		int ans[] = new int[m];

		ans[mid] = arr[0];
		int j = 1;
		int i = 1;

		for(i=1; i<=mid; i++){

			ans[mid+i] = arr[j++];
			ans[mid-i] = arr[j++];
		}

		if(m%2==0)
			ans[mid+i] = arr[j];

		return ans;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array");
		int m = sc.nextInt();
		int arr[] = new int[m];
		for(int i=0; i<m; i++){
			arr[i] = sc.nextInt();
		}

		int ans[] = pendulumArrangement(arr,m);

		for(int x : ans)
			System.out.print(x + "   ");
		System.out.println();
	}
}

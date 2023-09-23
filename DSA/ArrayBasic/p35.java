
import java.util.*;
class Demo{

	static void findPeakElement(int arr[],int m){

		ArrayList al = new ArrayList();

		if(arr[0] > arr[1])
			al.add(arr[0]);

		for(int i=1; i<m-1; i++){
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
				al.add(arr[i]);
			}
		}

		if(arr[m-1] > arr[m-2])
			al.add(arr[m-1]);

		System.out.println(al);
	}
		
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array");
		int m = sc.nextInt();
		int arr[] = new int[m];
		for(int i=0; i<m; i++){
			arr[i] = sc.nextInt();
		}

		findPeakElement(arr,m);
	}
}

		

		

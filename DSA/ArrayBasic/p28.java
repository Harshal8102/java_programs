//remove duplicates from unsorted array
import java.util.*;
class Demo{

	static int[] removeDuplicate(int arr[],int m){

		HashSet<Integer> hm = new HashSet<Integer>();

		for(int x : arr)
			hm.add(x);

		int a[] = hm.stream().mapToInt(Integer::intValue).toArray();
		
		return a;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array");
		int m = sc.nextInt();
		int arr[] = new int[m];
		for(int i=0; i<m; i++){
			arr[i] = sc.nextInt();
		}

		int ans[] = removeDuplicate(arr,m);

		for(int x : ans){
			System.out.print(x + "  ");
		}
		System.out.println();
	}
}

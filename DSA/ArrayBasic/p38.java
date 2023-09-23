//Leaders in an array

import java.util.*;
class Demo{

	static int[] findLeaders(int arr[],int n){
		ArrayList<Integer> al = new ArrayList<>();
		al.add(arr[n-1]);
		int max = arr[n-1];
		int j = 1;
		for(int i=n-2; i>=0; i--){

			if(arr[i] > max){
				al.add(arr[i]);
				j++;
			}

			if(max < arr[i])
				max = arr[i];
		}

		int ans[] = new int[j];
		int x = j-1;

		for(int i=0; i<j; i++){
			ans[i] = al.get(x--);
		}

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

		int ans[] = findLeaders(arr,m);
		for(int x : ans)
			System.out.print(x + "   ");
		System.out.println();
	}
}

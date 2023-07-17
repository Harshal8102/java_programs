
import java.util.*;
class Test{

	static int[] maxedRecord ( int [] arr){
		
		int count = 0;

		for(int i=0; i<arr.length-1 ; i++){

			for(int j=i+1; j<arr.length; j++){


				if(arr[i] == arr[j]){

					arr[j] = '-';
				}
			}

		}
		for(int i =0 ; i<arr.length; i++){
			if(arr[i] == '-'){
				count ++;
			}
		}

		int res[] = new int[arr.length - count];

		int j =0;

		for(int i=0; i<arr.length ; i++){

			if(arr[i] != '-'){

	       		       res[j] = arr[i];
			       j++;
			}
		}		

		return res;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter rows len:");
		int x = sc.nextInt();
		
		int arr[] = new int[x];

		for(int i=0; i<arr.length ; i++){

			arr[i] = sc.nextInt();
		}


		int ans[] = maxedRecord(arr);

		System.out.println("final array:");

		for(int i=0; i<ans.length ; i++){

			System.out.println(ans[i]);
		}

	}
}



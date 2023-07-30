
import java.util.*;

class demo{

	static int[] commonElement(int arr1[],int arr2[]){

		int count = 0;

		for(int i =0 ; i<arr1.length; i++){
			
			for(int j=0; j<arr2.length; j++){

				if(arr1[i] == arr2[j]){

				   	count++;
					break;					
				}
			}
		}
		int ans[] = new int[count];
		int z=0;
		for(int i =0 ; i<arr1.length; i++){
			
			for(int j=0; j<arr2.length; j++){

				if(arr1[i] == arr2[j]){

				   	ans[z++] = arr1[i];
					break;					
				}
			}
		}

		return ans;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array1 size");
		int arr1[] = new int[sc.nextInt()];
		System.out.println("Enter arrar1 elements");
		for(int i=0; i<arr1.length; i++){
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter array2 size");
		int arr2[] = new int[sc.nextInt()];
		System.out.println("Enter array2 elements");
		for(int i=0; i<arr2.length; i++){
			arr2[i] = sc.nextInt();
		}

		int ans[] = commonElement(arr1,arr2);

		System.out.println("common elements are:");
		for(int x : ans){
			System.out.println(x);
		}
	}
}


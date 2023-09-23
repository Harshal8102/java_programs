
import java.util.*;
class Demo{

	static int findCommon(int arr1[],int arr2[],int temp[]){

		int i=0,j=0,k=0;
		int n1 = arr1.length;
		int n2 = arr2.length;

		while(i<n1 && j<n2){

			if(arr1[i] < arr2[j]){
				i++;
			}
			else if(arr2[j] < arr1[i]){
			       j++;
			}
			else{
				temp[k] = arr1[i];
				i++;
				j++;
				k++;
			}
		}
		return k;
	}	

	public static void main(String[] args){

		int arr1[] = {1,5,5};
		int arr2[] = {3,4,5,5,10};
		int arr3[] = {5,5,10,20};

		int temp[] = new int[arr1.length];

		int k = findCommon(arr1,arr2,temp);

		int ans[] = new int[k];

		k = findCommon(arr3,temp,ans);

		for(int i=0; i<k; i++){

			System.out.print(ans[i] + " , " );
		}

		System.out.println();
	}
}

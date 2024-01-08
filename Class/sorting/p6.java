//Merge sort
import java.util.*;
class MergeSort{

	static void merge(int arr[],int start,int mid,int end){

		int n1 = mid-start+1;
		int n2 = end-mid;

		int a1[] = new int[n1];
		int a2[] = new int[n2];

		for(int i=0; i<a1.length; i++){

			a1[i] = arr[i+start];
		}
		for(int i=0; i<a2.length; i++){

			a2[i] = arr[mid+1+i];
		}

		int i=0,j=0,k=start;

		while(i < a1.length && j < a2.length){

			if(a1[i] < a2[j]){
				arr[k] = a1[i];
				i++;
			}else{
				arr[k] = a2[j];
				j++;
			}
			k++;
		}

		while(i < a1.length){
			arr[k] = a1[i];
			i++;
			k++;
		}
		while(j < a2.length){
			arr[k] = a2[j];
			j++;
			k++;
		}
	}

	static void mergeSort(int arr[] ,int start, int end){

		if(start < end){
			int mid = start + (end-start)/2;

			mergeSort(arr,start,mid);
			mergeSort(arr,mid+1,end);
			merge(arr,start,mid,end);
		}
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		System.out.println("Enter array elements");

		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

		mergeSort(arr,0,arr.length-1);
	
		System.out.println("Sorted array");
		for(int x : arr){
			System.out.print(x + "  ");
		}
	}
}

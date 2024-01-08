
//Merge sort

class Demo{

	static void merge(int arr[],int start,int mid,int end){

		int n1 = mid-start+1;
		int n2 = end-mid;

		int a1[] = new int[n1];
		int a2[] = new int[n2];

		for(int i=0; i<n1; i++){
			a1[i] = arr[start+i];
		}

		for(int j=0; j<n2; j++){
			a2[j] = arr[mid+1+j];
		}

		int i=0,j=0,k=start;

		while(i<n1 && j<n2){

			if(a1[i] < a2[j]){
				arr[k] = a1[i];
				i++;
			}else{
				arr[k] = a2[j];
				j++;
			}
			k++;
		}
		while(i < n1){
			arr[k] = a1[i];
			i++;
			k++;
		}
		while(j < n2){
			arr[k] = a2[j];
			j++;
			k++;
		}
	}


	static void mergeSort(int arr[],int start,int end){

		if(start < end){

			int mid = start + (end-start)/2;

			mergeSort(arr,start,mid);
			mergeSort(arr,mid+1,end);
			merge(arr,start,mid,end);
		}

	}

	public static void main(String[] args){

		int arr[] = new int[]{8,2,1,15,12,26,22};

		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + "   ");
		}
		System.out.println();

		mergeSort(arr,0,arr.length-1);

		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + "   ");
		}
		System.out.println();
	}
}

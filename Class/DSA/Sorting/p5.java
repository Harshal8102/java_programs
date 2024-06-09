//merge sort
class Demo{

	static void merge(int a[],int start,int mid,int end){

		int n1 = mid-start+1;
		int n2 = end-mid;

		int arr1[] = new int[n1];
		int arr2[] = new int[n2];
		
		for(int i=0; i<arr1.length; i++){
			arr1[i] = a[start+i];
		}
		for(int i=0; i<arr2.length; i++){
			arr2[i] = a[mid+1+i];
		}

		int k = start;
		int i=0,j=0;

		while(i<arr1.length && j < arr2.length){

			if(arr1[i] < arr2[j]){
				a[k] = arr1[i];
				i++;
			}else{
				a[k] = arr2[j];
				j++;
			}
			k++;
		}

		while(i < arr1.length){
			a[k] = arr1[i];
			i++;
			k++;
		}
		while(j < arr2.length){
			a[k] = arr2[j];
			j++;
			k++;
		}
	}


	static void mergeSort(int a[],int start,int end){

		if(start < end){

			int mid = start + (end-start)/2;

			mergeSort(a,start,mid);
			mergeSort(a,mid+1,end);

			merge(a,start,mid,end);
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

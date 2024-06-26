
class Demo{

	static int partition(int arr[],int start,int end){

		int pivot = arr[end];
		int i = start-1;

		for(int j=start; j <end; j++){
			if(arr[j] < pivot){
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[end] = temp;
		return i;
	}

	static void quickSort(int arr[],int start,int end){

		if(start < end){

			int pivotInd = partition(arr,start,end);

			quickSort(arr,start,pivotInd-1);
			quickSort(arr,pivotInd+1,end);
		}
	}

	public static void main(String[] args){

		int arr[] = new int[]{8,2,1,15,12,26,22};

		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + "   ");
		}
		System.out.println();

		quickSort(arr,0,arr.length-1);

		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + "   ");
		}
		System.out.println();
	}
}

//Insertion sort


class Demo{

	static void insertionSort(int arr[]){

		int count = 0;
		for(int i=1; i<arr.length; i++){

			int element = arr[i];
			int j = i-1;
			int x = 0;

			while(j >= 0 && arr[j] > element){
				arr[j+1] = arr[j];
				j--;
				count++;
				x = 1;
			}

			if(x == 0)
				count++;

			arr[j+1] = element;
		}
		System.out.println(count);
	}
/*
	static void insertionSort(int arr[],int i){
		
		if(arr.length == 1)
			return;

		if(i >= arr.length)
			return;
		
		int element = arr[i];
		int j=i-1;
		while(j >= 0 && arr[j] > element){
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = element;
		insertionSort(arr,i+1);		
	}*/

	public static void main(String[] args){

		int arr[] = new int[]{8,2,1,15,12,26,22};

		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + "   ");
		}
		System.out.println();

		insertionSort(arr);

		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + "   ");
		}
		System.out.println();
	}
}

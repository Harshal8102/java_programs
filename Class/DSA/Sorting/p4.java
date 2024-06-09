//selection sort


class Demo{

	static void selectionSort(int a[]){

		int count = 0;
		for(int i=0; i<a.length-1; i++){

			int minInd = i;
			for(int j = i+1; j<a.length; j++){
				if(a[minInd] > a[j])
					minInd = j;
				count++;
			}

			swap(a,i,minInd);
		}
		System.out.println(count);
	}

	static void swap(int a[],int i,int j){

		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
/*
	static void selectionSort(int a[],int i){

		if(a.length == 1)
			return;

		if(i == a.length-1)
			return;

		int minInd = i;
		for(int j=i+1; j<a.length; j++){
			if(a[j] < a[minInd])
				minInd = j;
		}

		swap(a,i,minInd);
		selectionSort(a,i+1);
	}*/

	public static void main(String[] args){

		int arr[] = new int[]{8,2,1,15,12,26,22};

		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + "   ");
		}
		System.out.println();

		selectionSort(arr);

		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + "   ");
		}
		System.out.println();
	}
}

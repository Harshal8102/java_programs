
//Bubble Sort
class Demo{

	static void swap(int a[],int i,int j){

		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	static void bubbleSort(int arr[]){

		int count1=0,count2=0;

		for(int i=0; i<arr.length; i++){

			boolean check = false;
			count1++;
			for(int j=0; j<arr.length-1-i; j++){

				count2++;
				if(arr[j] > arr[j+1]){

					swap(arr,j,j+1);
					check = true;
				}
			}
			if(check == false)
				break;
		}

		System.out.println("for loop 1 :" + count1);
	        System.out.println("for loop 2 :" + count2);       
	}

	public static void main(String[] args){

		int arr[] = new int[]{7,3,9,4,2,5,6};

		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + "   ");
		}
		System.out.println();

		bubbleSort(arr);

		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + "   ");
		}
		System.out.println();
	}
}

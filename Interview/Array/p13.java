
import java.util.*;

class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array1 size");
		int arr1[] = new int[sc.nextInt()];
		System.out.println("Enter array1 elements");
		for(int i=0; i<arr1.length; i++){
			arr1[i] = sc.nextInt();
		}

		System.out.println("Enter array2 size");
		int arr2[] = new int[sc.nextInt()];
		System.out.println("Enter array2 elements");
		for(int i=0; i<arr2.length; i++){
			arr2[i] = sc.nextInt();
		}
		int merge[] = new int[arr1.length + arr2.length];
		int j = 0;
		for(int i=0; i<merge.length; i++){

			if(i < arr1.length){

				merge[i] = arr1[i];
			}else{
				merge[i] = arr2[j++];
			}
		}
		System.out.println("Merged array is : ");
		for(int x : merge)

			System.out.print( x );

		System.out.println();
	
	}
}


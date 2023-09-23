
import java.util.*;
class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array");
		int m = sc.nextInt();
		int arr[] = new int[m];
		for(int i=0; i<m; i++){
			arr[i] = sc.nextInt();
		}

		
		int j = 0;
		int temp = 0;

		for(int i=0; i<m; i++){

			if(arr[i] < 0){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}

		for(int x : arr)
			System.out.print(x + "   ");
		System.out.println();
	}
}

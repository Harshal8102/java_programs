//Positive & negative elements
import java.util.*;
class Demo{

	public static void main(String[] args){

		int arr[] = {-1,2,-3,4,-5,6};

		int n = 6;
		int i = -1;
		int temp = 0;

		for(int j=0; j<n; j++){

			if(arr[j] > 0){
				i++;
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}

		int neg = i+1, pos = 1;

		while(pos < n && neg < n && arr[neg] < 0){

			temp = arr[neg];
			arr[neg] = arr[pos];
			arr[pos] = temp;

			pos += 2;
			neg++;
			
		}

		for(int x : arr){
			System.out.println(x);
		}

	}
}




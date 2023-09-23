
import java.util.*;
class Demo{

	static boolean findPair(int arr[],int x){

		for(int i=0; i<arr.length-1; i++){

			for(int j=i+1; j<arr.length; j++){

				if(arr[i] + arr[j] == x){
					return true;
				}
			}
		}

		return false;
	}

	public static void main(String[] args){


		int arr[] = {1,-2,1,0,5};
		int x = 0;

		if(findPair(arr,x)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
	}
}

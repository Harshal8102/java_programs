//finding floor & ceiling in array for x
import java.util.*;
class Demo{

	static void findFC(int arr[],int n,int x){

		int f = -1;
		int c = -1;
		int fDist = Integer.MAX_VALUE;
		int cDist = Integer.MAX_VALUE;

		for(int i=0; i<n; i++){

			//for floor
			if(arr[i] <= x    &&  fDist > x-arr[i]){           
				f = arr[i];
				fDist = x - arr[i];
			}
		
			//for ceiling
			if(arr[i] >= x  && cDist > arr[i]-x){
				c = arr[i];
				cDist = arr[i] - x;
			}
		}

		if(fDist == Integer.MAX_VALUE){
			System.out.println("floor doesn't exists so, floor = " + -1);
		}else{
			System.out.println("floor = " + f);
		}
		if(cDist == Integer.MAX_VALUE){
			System.out.println("ceiling doesn't exists so, ceiling = " + -1 );
		}else{
			System.out.println("Ceiling = " + c);
		}
	}

	public static void main(String[] args){

		int arr[] = {5,6,8,9,6,5,5,6};
		int n = 8;
		int x = 10;

		findFC(arr,n,x);
	}
}

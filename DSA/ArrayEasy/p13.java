//Minimum distance bet two elements
import java.util.*;
class Demo{

	static int minimumDistance(int arr[],int x,int y){

		int min = Integer.MAX_VALUE;
		int st = 0;
		int en = 0;

		for(int i=0; i<arr.length; i++){
			if(arr[i] == x){
				st = i+1;
			}
			if(arr[i] == y){
				en = i+1;
			}
			if(st > 0 && en > 0){
				if(min > en-st)
					min = en-st;
			}
		}

		if(min <= arr.length)
			return min;
		return -1;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println("Enter value of x & y");
		int x = sc.nextInt();
		int y = sc.nextInt();

		System.out.println(minimumDistance(arr,x,y));
	}
}

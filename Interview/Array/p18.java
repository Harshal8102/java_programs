
import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int x  = sc.nextInt();

		int n = x;
		int count =0;
		while(n != 0){
			count++;
			n = n / 10;
		}

		int arr[] = new int[count];

		for(int i=count-1; i>=0  ;i--){

			int rem = x % 10;
			arr[i] = rem;
			x = x / 10;
		}
		
		int c = 0;
		for(int i=arr.length-1; i>=0; i--){

			if(arr[i] != 0){
				break;
			}else{
				c++;
			}
			
		}
		System.out.println("Number of trailing zeros : " + c);
	}	
}

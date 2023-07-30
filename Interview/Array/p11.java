//no. of even & odd numbers

import java.util.*;

class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size");
		int size = sc.nextInt();

		int arr[] = new int[size];
		int even = 0;
		int odd = 0;

		for(int i=0; i<arr.length; i++){

			arr[i] = sc.nextInt();
			if(arr[i] % 2 == 0){

				even++;
			}else{
				odd++;
			}	
		}

		System.out.println("no. of even elements :" + even);
		System.out.println("no. of odd elements :" + odd);
		
	}
}


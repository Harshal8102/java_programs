
import java.util.*;

class demo{

	static int[] findArmstrong(int arr[]){
		int temp[] = new int[arr.length];
		int z = 0;
		for(int i=0; i<arr.length; i++){

			int temp1 = arr[i];
			int temp2 = arr[i];
			int count = 0;

			while(temp1 != 0){

				count++;
				temp1 = temp1 / 10;
			}
			int sum = 0;
			while(temp2 != 0){

				int rem = temp2 % 10;
				int mul =1;
				for(int j=1;j<=count; j++){
					mul = mul * rem;
				}
				sum = sum + mul;

				temp2 = temp2 / 10;
			}
			if(sum == arr[i]){
				
				temp[z++] = arr[i];
			}
		}
		int ans[] = new int[z];
		for(int i=0; i<z; i++){
			ans[i] = temp[i];
		}
		
		return ans;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for(int i=0; i<arr.length; i++){

			arr[i] = sc.nextInt();
		}
		
		int ans[] = findArmstrong(arr);
		System.out.println("Armstrong numbers are:");
		for(int x : ans)
			System.out.println(x);
	}
}


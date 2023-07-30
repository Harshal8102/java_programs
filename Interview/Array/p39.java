import java.util.*;
class demo{

	static int checkDistinct(int arr1[],int arr2[]){

		int temp[] = new int[arr1.length + arr2.length];

		for(int i=0; i<arr1.length; i++){

			temp[i] = arr1[i];
		}
		for(int i=0; i<arr2.length; i++){

			temp[arr1.length + i] = arr2[i];
		}
		Arrays.sort(temp);
		int count = 0;

		for(int i=0 ; i<temp.length-1 ; i++){

			if(temp[i] == temp[i+1]){
				
			}else{

				count++;
				if(i > 0){

					if(temp[i] == temp[i-1]){
						count--;
					}			
				}
			}
		}
		if(temp[temp.length-1] != temp[temp.length-2]){
			count++;
		}

		return count;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int arr1[] = new int[6];
		int arr2[] = new int[6];

		for(int i=0 ; i<arr1.length; i++){
			arr1[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr2.length; i++){

			arr2[i] = sc.nextInt();
		}

		int count = checkDistinct(arr1,arr2);

		System.out.println("Distinct elements are : " + count);
	}
}

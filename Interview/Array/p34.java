import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int arr[][] = new int[3][3];

		for(int i=0;i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				arr[i][j] = sc.nextInt();
			}
		}

	
		for(int i=0; i < arr.length; i++){

			for(int j=0; j < arr.length; j++){

				for(int k=0 ; k < arr.length; k++){

					for(int z=0; z < arr.length; z++){

						if(arr[i][j] < arr[k][z]){

							int temp = arr[i][j];
							arr[i][j] = arr[k][z];
							arr[k][z] = temp;
						}
					}
				}
			}
		}

				
		
		for(int x[] :  arr){
			for(int y : x){	
				System.out.print(y + "   ");
			}
			System.out.println();
		}
		
		
	}

}


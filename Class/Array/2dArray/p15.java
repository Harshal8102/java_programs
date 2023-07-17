import java.util.*;
class Test{

	static int[] maxedRecord ( int [][] arr){

		int[] res = new int[arr.length];

		for(int i=0; i<arr.length ; i++){

			int max = arr[i][0];



			for(int j=0; j<arr[i].length; j++){

			 	if(max < arr[i][j]){

					max = arr[i][j];
				}	
			}
			res[i] = max;
		}

		return res;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter rows len:");
		int x = sc.nextInt();

		System.out.println("Enter col len:");
		int y = sc.nextInt();
		
		int arr[][] = new int[x][y];

		for(int i=0; i<arr.length ; i++){

			for(int j=0; j<arr[i].length; j++){

				arr[i][j] = sc.nextInt();
			}
		}


		int ans[] = maxedRecord(arr);

		System.out.println("maximum no. form each row:");

		for(int i=0; i<ans.length ; i++){

			System.out.println(ans[i]);
		}

	}
}






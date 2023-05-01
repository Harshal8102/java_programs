class demo{

	public static void main(String[] args){

		int arr[][] = new int[3][3];      //normal array

		int arr2[][] = {{1,2,3},{4,5},{6}};

		for(int[] x : arr2){

			for(int y : x){

				System.out.print(y + "  ");
			}

			System.out.println();
		}
	}
}


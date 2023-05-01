class demo{

	public static void main(String[] args){

		int arr[][][] = new int[3][3][3];

		for(int z=0; z<arr.length; z++){

			for(int i=0; i<arr[z].length; i++){

				for(int j=0; j<arr[z][i].length; j++){

					System.out.print(arr[z][i][j] + "  ");
				}
				System.out.println();
			}
			System.out.println();
		
		}

	}
}


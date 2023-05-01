class demo{

	public static void main(String[] args){

		int arr[][][][] = new int[3][3][3][3];

		for(int k=0;k<arr.length; k++){

			for(int z=0; z<arr[k].length; z++){

				for(int i=0; i<arr[k][z].length; i++){

					for(int j=0; j<arr[k][z][i].length; j++){

						System.out.print(arr[k][z][i][j] + "  ");
					}
					System.out.println();
				}
				System.out.println();
				
			}
			System.out.println();
		}
	}
}


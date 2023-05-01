class JaggedArray{

	public static void main(String[] args){

		int arr[][] = new int[][]{{1,2,3},{4,5},{6}};

		/*arr[0] = new int[]{1,2,3};
		arr[1] = new int[]{4,5};
		arr[2] = new int[]{6};*/

		for(int [] x : arr){

			for(int y : x){

				System.out.print(y + "  ");
			}
			System.out.println();
		}
	}
}



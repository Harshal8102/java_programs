class demo{

	public static void main(String[] args){

		int arr[] = {10,20,30,40,50};

		for(int x : arr){

			System.out.println(x);

			if(x == arr[2]){
				break;
			}
		}
	}
}


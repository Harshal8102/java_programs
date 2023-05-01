class NullPointerDemo{

	public static void main(String[] args){

		int arr1[][] = {{},{},{}};  //complete declaration

		int arr2[][] = new int[2][];	//incomplete declaration
						
		System.out.println(arr1.length);
		System.out.println(arr1[0].length);

		System.out.println(arr2.length);
		System.out.println(arr2[0].length);
	}
}


class c2w{

	public static void main(String[] args){

		int arr1[] = {10,20,30,40,50};
		float arr2[] = {10,20,30,40,50};

		System.out.println(arr1);
		System.out.println(arr2);



		System.out.println(System.identityHashCode(arr1));
		System.out.println(System.identityHashCode(arr2));



		System.out.println(System.identityHashCode(arr1[4]));
		System.out.println(System.identityHashCode(arr2[4]));
	}
}


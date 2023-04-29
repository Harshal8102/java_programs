class Arraydemo{

	public static void main(String[] args){

		long arr1[] = {1,2,3};
		long arr2[] = {4,5};

		long[][] arrLong = new long[2][];

		arrLong[0] = arr1;

		arrLong[1] = arr2;

		System.out.println(arrLong[0][1]);
	}
}


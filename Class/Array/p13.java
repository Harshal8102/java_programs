class c2w{

	public static void main(String[] args){

		int arr[][][][] = new int[2][][][];

		arr[0] = new int[][][]{{{1,2,3},{4,5,6}},{{10,20,30},{40,50,60}}};
		arr[1] = new int[][][]{{{12,25,36},{12,32,36}},{{36,65,54},{55,8,95}}};

		System.out.println(arr[1][1][1][2]);

	}
}


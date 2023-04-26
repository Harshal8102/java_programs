class Demo{

	public static void main(String[] args){

		int arr[] = {10,20,30};

		String friends[] = {"Ashish","Kanha","Badhe","Rahul"};

		for(String x : friends){

			System.out.println(x);
		}

		for(int i=0; i<args.length; i++){

			System.out.println(args[i]);
		}
	}
}


class demo{

	public static void main(String[] args){

		String str[] = {"rajesh","virat","rohit","dhoni"};

		System.out.println(System.identityHashCode(str[0]);
	}
}

class ArrayDemo{

	void fun(int[] arr){

		arr[1] = 70;
		arr[2] = 80;
	}

	public static void main(String[] args){

		int arr[] = {10,20,30,40};

		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));
		System.out.println(System.identityHashCode(arr[3]));

		ArrayDemo obj = new ArrayDemo();

		obj.fun(arr);

		for(int x : arr){

			System.out.println(x);
		}

		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));

		int x = 70;
		int y = 80;

		
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
	}
}
			

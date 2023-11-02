//Print no. between 1 to 10

class Recurrsion{

	/*void printNumbers(int n){

		for(int i=1; i<=n; i++){

			System.out.println(i);
		}
	}*/

	void printNumbers(int n){

		if(n == 0)
			return ;

		printNumbers(n-1);

		System.out.println(n);
	}

	public static void main(String[] args){

		Recurrsion obj = new Recurrsion();

		obj.printNumbers(10);

	}
}



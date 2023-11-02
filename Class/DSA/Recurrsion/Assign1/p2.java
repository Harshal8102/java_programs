//display first 10 natural numbers in reverse order

class Recurrsion{

	int n = 10;
	/*void naturalNumbers(){

		for(int i=10; i>=1; i--){

			System.out.println(i);
		}
	}*/

	void naturalNumbers(){

		if(n == 0)
			return;

		System.out.println(n--);

		naturalNumbers();
	}

	public static void main(String[] args){

		Recurrsion obj = new Recurrsion();

		obj.naturalNumbers();
	}
}

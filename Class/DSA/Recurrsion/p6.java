//sum of digits by recurrsion

class Recurrsion{

	int sum = 0;
	/*
	int calDigits(int n){

		if(n == 0)
			return 0;

		sum = sum + (n % 10);

		calDigits(n / 10);

		return sum;
	}*/

	int calDigits(int n){

		if(n == 0)
			return 0;

		return (n % 10) + calDigits(n/10);
	}

	public static void main(String[] args){

		Recurrsion obj = new Recurrsion();

		System.out.println(obj.calDigits(1524));
	}
}

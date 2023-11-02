
class Recurrsion{
	
	int sum(int n){

		if(n == 0)
			return 1;

		return 5 + sum(--n);
	}

	public static void main(String[] args){

		Recurrsion obj = new Recurrsion();

		System.out.println(obj.sum(2));

	}
}

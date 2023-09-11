
//get ith bit
class demo{

	public static void main(String[] args){

		int n = 15;

		int  i =2;

		if((n & (1<<i)) == 0){

			System.out.println(i + " position is 0");
		}else{
			System.out.println(i + " position is 1");
		}
	}
}



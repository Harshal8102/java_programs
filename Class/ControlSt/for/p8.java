/* Take N as input & print whether N as Armstrong number or not*/

class Armstrong{

	public static void main(String[] args){

		int rem,count=0;
		int N = 153;
		int number = N;

		/*ile(N != 0){

			rem = N % 10;
			count = count + rem*rem*rem ;
			N = N/10;
		}*/

		for(  ;N != 0;  ){

			rem = N % 10;
			count = count + rem*rem*rem ;
			N = N/10;
		}

		if(count == number){

			System.out.println(number + " is Armstrong number");
		}else{
			System.out.println(number + " is not Armstrong number");
		}
	}
}

/*Program to print sum of all even number & multiplication of all odd number*/

class digit{

	public static void main(String[] args){

		int sum = 0, mul=1;
              

		for(int i=1 ; i<=10 ; i++){

			if(i%2==0){

				sum = sum + i;
			}else{
				mul = mul * i;

			}
		}

		System.out.println(sum);
		System.out.println(mul);
	}
}


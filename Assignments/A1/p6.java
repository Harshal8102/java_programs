/* print sum of all even number & multiplication of all odd number between 1 to 10*/

class sum{

	public static void main(String[] args){

		int i = 1;
		int sum = 0;
		int mul = 1;

		while(i<=10){

			if(i%2==0){
				sum = sum + i;
			}else{
				mul = mul * i;
			}
			i++;
		}
		System.out.println("sum of even no. is " + sum);
		System.out.println("product of odd no. is " + mul);
	}
}

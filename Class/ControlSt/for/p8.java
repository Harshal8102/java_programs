/* Take N as input & print whether N as Armstrong number or not*/

class Armstrong{

	public static void main(String[] args){

		int count=0;
		int rem,N=1564;
		int temp1=N,temp2=N;
		int sum=0;

		while(temp2!=0){
			temp2 = temp2 / 10;
			count++;
		}

		while(temp1!=0){

			rem = temp1 % 10;
			int mul = 1;

			for(int i=1; i<=count; i++){

				mul = mul * rem;
			}

			sum = sum + mul;
			temp1 = temp1 / 10;
		}

		if(sum == N){

			System.out.println(N + " is armstrong number");
		}else{
			System.out.println(N + " is not armstrong number");
		}



	}
}

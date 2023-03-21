

class number{

	public static void main(String[] args){

		int n=6;

		if(n%2==0){

			for(  ;n!=0 ; n--){

				System.out.println(n);

			}
		}else{
			for(   ; n>0;   ){

				System.out.println(n);
				n = n-2;
			}
		}
	}
}

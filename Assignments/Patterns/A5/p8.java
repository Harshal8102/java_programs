/* A b C d 
 * E f G h
 * I j K l
 * M n O p*/

class c2w{

	public static void main(String[] args){

		char ch='A';
		char c = 'b';

		for(int i =1; i<=4; i++){

			for(int j=1; j<=4; j++){

				if(j%2!=0){
					System.out.print(ch + " ");
					ch+=2;
				}else{
					System.out.print(c + " ");
					c+=2;
				}

			}
			System.out.println();
		}
	}
}


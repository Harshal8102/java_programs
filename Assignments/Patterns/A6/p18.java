/* 10
 * I   H
 * 7   6   5
 * D   C   B   A */

class c2w{

	public static void main(String[] args){

		int row = 4;
		int num = (row*(row+1))/2;
		char ch = (char)(num+64);    //typecasting

		for(int i=1; i<=row; i++){

			for(int j=1; j<=i; j++){

				if(i%2!=0){

					System.out.print(num + "  ");
				}else{
					System.out.print(ch + "  ");
				}

				num--;
				ch--;
			}

			System.out.println();
		}
	}
}


/* 1
 * 2 c
 * 4 e 6
 * 7 h 9 j */

class c2w{

	public static void main(String[] args){
		
		int n=1;
		char ch= 'a';
		int row=5;

		for(int i=1; i<=row; i++){

			for(int j=1; j<=i; j++){

				if(j%2!=0){
					System.out.print(n + "  ");
				}else{
					System.out.print(ch + "  ");
				}

				n++;
				ch++;
			}
			System.out.print("\n");
		}
	}
}

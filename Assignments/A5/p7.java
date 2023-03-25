/* 1 2 9
 * 4 25 6
 * 49 8 81*/

class c2w{

	public static void main(String[] args){

		int n = 1;

		for(int i=1; i<=3; i++){

			for(int j=1; j<=3; j++){

				if((i==1 && j==3) || (i==2 && j==2) || (i==3 && j==1) || (i==3 && j==3)){

					System.out.print(n*n + "  ");
				}else{
					System.out.print(n + "  ");
				}

				n++;
			}
			
			System.out.println();
		}
	}
}


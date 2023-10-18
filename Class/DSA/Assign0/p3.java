/* D C B A
 * e f g h
 * F E D C
 * g h i j */

class Demo{

	public static void main(String[] args){

		int n = 4;
		char ch = (char)(64 + n);

		for(int i=0; i<n; i++){

			for(int j=0; j<n; j++){

				if(i % 2 == 0){
					System.out.print(ch + "   ");
					ch--;
				}
				else{
					System.out.print((char)(ch+32) + "   ");
					ch++;
				}
			
			}

			System.out.println();
			if(i % 2 == 0){
				ch += n+1;
			}else{
				ch -= i+2;
			}
		}
	}
}

				

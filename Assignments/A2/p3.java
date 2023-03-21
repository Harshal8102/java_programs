/*first 10 three digit numbers*/

class loops{

	public static void main(String[] args){

		/*for(int i = 100; i<110; i++){
			System.out.println(i);
		}*/

		for(int i =1;i<=200;i++){
			int N=i;
			int count=0;

                        while(N!=0){
				count++;
				N=N/10;
			}
			if(count==3){
				if(i>109){
					break;
				}

				System.out.println(i);
				
			}
		}
	}
}

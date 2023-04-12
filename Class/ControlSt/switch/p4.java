import java.util.Scanner;
class c2w{

	public static void main(String[] args){

		Scanner obj = new Scanner(System.in);

		int total = 0;
		int x=0;

		for(int i =1; i<=5; i++){
	
			System.out.println("Enter marks of 5 different subjects:");
			int sub = obj.nextInt();
	
			if(sub<40){
				System.out.println("You failed in exam");
				break;
			}else if(sub >=40){
			total = total + sub;
			}
		}

		if(total>=350){
			x = 1;
		}else if(total>250 && total<350){
			x = 2;
		}else if(total>=200 && total<=250){
			x = 3;
		}

        	switch(x){
		        case 1 :
		                 System.out.println("distinction");
	                         break;
		        case 2 :
                                 System.out.println("First-class");
                                 break;
		        case 3 :
                               	 System.out.println("Second-class");
	                         break;
		}
	}
}


				

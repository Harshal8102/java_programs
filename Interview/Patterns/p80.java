
import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of rows");
		int row = sc.nextInt();
		char ch = 'a';
		for(int i=1; i<=row; i++){

			for(int j=1; j<=row+i-1; j++){

				if(j<=row-i){
					System.out.print("   ");
				}else{
					if(i%2 == 0){
						System.out.print(ch + "  ");
					}else{
						System.out.print((char)(ch-32) + "  ");
					}

					if(i%2 == 0){
						if(j < row){
							ch--;
						}else{
							ch++;
						}
					}else{
						if(j < row){
							ch += 2;
						}else{
							ch -= 2;
						}
					}
				}
			}
			System.out.println();
			if(i % 2 != 0){
				ch += 3;
			}
		}
	}
}




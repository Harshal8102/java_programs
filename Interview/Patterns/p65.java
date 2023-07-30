

import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of rows");
		int row = sc.nextInt();
		int n = 1;
		for(int i=1; i<=row; i++){

			for(int j=1; j<=i+(i-1) ;j++){

				if(j%2!=0){

					if(i%2!=0){
						System.out.print(n++ + "  ");
					}else{
						System.out.print(n-- + "  ");
					}
				}else{
					System.out.print("*  ");
				}
			}
			System.out.println();
			if(i%2!=0){
				n += i;
			}else{
				n += (i+1);
			}
		}
	}
}


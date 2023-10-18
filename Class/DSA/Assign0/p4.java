// A b C d E
// e D c B
// B c D
// d C
// C

import java.util.*;
class Demo{

	public static void main(String[] args){

		int n = 5;

		char ch = 'A';

		for(int i=0; i < n; i++){

			for(int j=0; j < n-i; j++){

				if(i%2==0 && j%2==0 || i%2!=0 && j%2!=0){

					System.out.print(ch + "   ");
				}else{
					System.out.print((char)(ch+32) + "   ");
				}
				if(i%2 == 0){
					ch++;
				}else
					ch--;

			}
			System.out.println();

			if(i%2 == 0)
				ch--;
			else
				ch++;
		}
	}
}




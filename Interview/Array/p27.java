
import java.io.*;
class demo{

	public static void main(String[] args){
	
		int z = 1;

		for(int i=0; i<4; i++){

			for(int j=0;j<1000 ; j++){

				int count = 0;
				
				for(int k=1; k<=z; k++){

					if(z % k == 0){
						count++;
					}
				}

				if(count == 2){

					System.out.print(z + "   ");
				}

				z++;
				if( z == 10 || z == 50 || z == 100 || z == 120)
					break;
			}
			if(z >= 120)
				break;

			System.out.println();
		}
	}
}

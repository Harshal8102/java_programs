import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of rows");
		int row = sc.nextInt();
		int n=1;
		for(int i=1; i<=row; i++){

			for(int j=1; j<=row; j++){

				if(j <= row-i){

					System.out.print("_    ");
				}else{
					int mul = 1;
					for(int k=1; k<=i; k++){
						mul *= n;
					}
					System.out.print(mul + "    ");
					n++;
				}
			}
			System.out.println();
		}
	}
}




import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int bars[] = new int[7];

		System.out.println("Enter heights of bars:");
		for(int i=0; i<bars.length; i++){

			bars[i] = sc.nextInt();
		}

		int LMaxB[] = new int[bars.length];
		int RMaxB[] = new int[bars.length];
		//Left max boundary
		LMaxB[0] = bars[0];
		for(int i=1; i<LMaxB.length; i++){

			if(bars[i] < LMaxB[i-1]){

				LMaxB[i] = LMaxB[i-1];
			}else{
				LMaxB[i] = bars[i];
			}
		}
		//Right max boundary
		RMaxB[RMaxB.length-1] = bars[bars.length-1];
		for(int i=RMaxB.length-2; i>=0; i--){

			if(bars[i] < RMaxB[i+1]){
				RMaxB[i] = RMaxB[i+1];
			}else{
				RMaxB[i] = bars[i];
			}
		}
		int width = 1;

		int TrappedWater = 0;
		for(int i=0; i<bars.length; i++){

			int waterLevel = Math.min(LMaxB[i],RMaxB[i]);

			waterLevel = (waterLevel - bars[i])*width;

			if(waterLevel < 0){
				waterLevel = 0;
			}

			TrappedWater += waterLevel;
		}

		System.out.println("Total water trapped = " + TrappedWater);
	}
}



			
















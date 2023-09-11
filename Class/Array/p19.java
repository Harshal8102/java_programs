import java.util.*;
class demo{

	static int MaxPrice(int[] Selprice){

		int buyPrice = Integer.MAX_VALUE;
		int maxProfit = 0;

		for(int i=0; i<Selprice.length; i++){

			if(buyPrice <  Selprice[i]){

				int profit = Selprice[i] - buyPrice;

				maxProfit = Math.max(profit,maxProfit);
			}else{
				buyPrice = Selprice[i];
			}
		}

		return maxProfit;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int prices[] = new int[7];

		System.out.println("Enter prices of stock per day");
		for(int i=0; i<prices.length; i++){

			prices[i] = sc.nextInt();
		}

		System.out.println(MaxPrice(prices));
	}
}

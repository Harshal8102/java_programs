/*Electricity bill problem
 * Given an integer input A which represent units of electricity consumed at your house
 * calculate & print bill amount
 * units <= 100 :  price per unit is 1
 * units > 100  :  price per unit is 2*/


class ifelse{

	public static void main(String[] args){

		int unit = 200;

		if(unit <= 100){
			System.out.println( unit * 1);
		}else{
			System.out.println( (unit - 100)*2 + 100*1);
		}
	}
}


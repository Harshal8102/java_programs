class profitorloss{

	public static void main(String[] args){

		double sp = 70000;
		double cp = 70000;
                
		if(sp>cp){
			double x = sp - cp;
			System.out.println("Profit of " + x);
		}else if(cp>sp){
			double y = cp - sp;
			System.out.println("Loss of " + y);
		}else{

			System.out.println("No profit or no loss");
		}
	}
}

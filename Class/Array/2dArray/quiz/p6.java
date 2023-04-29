class Arraydemo{

	public static void main(String[] args){

		int arrInt[][] = new int[3][2];

		for(int outr = 0; outr < 3; outr++){

			for(int inr = 0; inr < 2; inr++){

				arrInt[outr][inr] = (outr + inr) * outr;
			}
		}

		System.out.println("arrInt[1][1] : " + arrInt[1][1]);
	}
}



//update ith bit

class demo{

	static int clearIthBit(int n,int i){

		int bitMask = ~(1<<i);

		return n & bitMask;
	}

	static int updateIthBit(int n,int i,int newBit){

		n = clearIthBit(n,i);
		
		int bitMask = newBit<<i;

		return n | bitMask;
	}

	public static void main(String[] args){


		int n = 10;
		int i = 0;
		int newBit = 1;

		System.out.println(updateIthBit(n,i,newBit));
	}
}

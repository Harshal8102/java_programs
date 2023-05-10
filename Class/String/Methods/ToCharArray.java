class ToCharArrayDemo{

	static int myStrLen(String str){

		char []  arr = str.toCharArray();
		int count=0;

		for(int x : arr){
			count++;
		}

		return count;
	}

	public static void main(String[] args){

		String str1 = "HarshalMohite";

		System.out.println(str1.length());

		int len = myStrLen(str1);

		System.out.println(len);
	}
}


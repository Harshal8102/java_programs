class Stringdemo{

	public static void main(String[] args){

		String str1 = "Core2web"; //SCP
	        String str2 = new String("Core2web"); //heap

		char[] str = {'C','2','W'}; //Heap
		String str3 = new String(str);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}



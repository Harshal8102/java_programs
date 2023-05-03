class Stringdemo{

	public static void main(String[] args){

		String str1 = "kanha";  //SCP
		String str2 = "kanha";  //SCP
		String str3 = new String("kanha");  //Heap
		String str4 = new String("kanha");  //Heap
		String str5 = new String("Rahul");  //Heap;
		String str6 = "Rahul";  //SCP

	       	
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
		System.out.println(System.identityHashCode(str6));
	}
}








class Core2web{

	public static void main(String[] args){

		StringBuffer str = new StringBuffer(400);

		System.out.println(str.capacity());
	
		str.append("Java_Developement_kit");

		System.out.println(str.capacity());
	                                                
		str.trimToSize();                          //trims the capacity upto length of string stored in it
	
		str.setLength(10);                        //setLength() set length of string upto enter int parameter but it not change in capacity

		System.out.println(str.capacity());
		System.out.println(str.length());
	}
}


class Core2web{

	public static void main(String[] args){

		String var1 ="core2web";

		StringBuffer var2 = new StringBuffer("core2web");

		if(var1.equals(var2)){      //equals() check the hashCode of two objects, but if two objects are of different class then their 
					    //hashCode will be different

			System.out.println("Equal");
		}else{
			System.out.println("Not equal");
		}
	}
}


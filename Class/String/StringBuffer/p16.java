class Core2web{

	public static void main(String[] args){

		StringBuffer sbvar1 = new StringBuffer("core2web");

		long lv1 = System.identityHashCode(sbvar1);

		sbvar1.append("technologies");

		long lv2 = System.identityHashCode(sbvar1);

		if (lv1 == lv2){

			System.out.println("True");
		}else{
			System.out.println("False");
		}
	}
}


class SBDemo{

	public static void main(String[] args){

		StringBuffer sb = new StringBuffer(100);    //initialCapacity

		sb.append("Binecaps");
		sb.append("core2web");

		System.out.println(sb);
		System.out.println(sb.capacity());

		sb.append("Incubator");

		System.out.println(sb);
		System.out.println(sb.capacity());
	}
}


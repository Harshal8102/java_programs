class StringBufferDemo{

	public static void main(String[] args){

		StringBuffer sb = new StringBuffer();
		
		sb.capacity();
		System.out.println(sb);

		sb.append("shashi");

		System.out.println(sb.capacity());
		System.out.println(sb);

		sb.append("Bagal");

		System.out.println(sb.capacity());
		System.out.println(sb);

		sb.append("core2web");

		System.out.println(sb.capacity());
		System.out.println(sb);
	}
}



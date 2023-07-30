
class c2w{

	public static void main(String[] args){

		StringBuffer str = new StringBuffer(400);

		str.append(400);
		System.out.println(str);

		str.setLength(str.length());
		System.out.println(str.length());

		System.out.println(str.capacity());
	}
}


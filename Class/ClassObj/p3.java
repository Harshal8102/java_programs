class Amazon{

	String mov = "KGF";
	
	void movies(){

		System.out.println("This is movie section");
	}

	public static void main(String[] args){

		Amazon obj = new Amazon();

		obj.movies();
		System.out.println(obj.mov);
	}
}	

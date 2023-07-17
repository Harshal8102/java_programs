class Project{

	String ProjName = "Online Edu";
	int noOfEmp = 20;

	void ClientInfo(){

		String clientName = "core2web";
		System.out.println(clientName);
		System.out.println(ProjName);
		System.out.println(noOfEmp);
	}
}

class c2w{

	public static void main(String[] args){

		Project obj = new Project();
		obj.ClientInfo();
	}
}


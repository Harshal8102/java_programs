import java.io.*;
class c2w{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("What do you want to do:");
		System.out.println("1.Shoping");
		System.out.println("2.Eating");

		int x = Integer.parseInt(br.readLine());
		switch(x){

			case 1 : System.out.println("From which brand showroom do you wanna shop:");
		                 System.out.println("1.Nike");
		                 System.out.println("2.Puma");
				 System.out.println("3.Pantaloons");
			      	 System.out.println("4.Mufti");
		                 System.out.println("5.Jaara");
	                       	 
				 int choice = Integer.parseInt(br.readLine());

				 switch(choice){
					 case 1 : System.out.println("Nike");
						  break;
					 case 2 : System.out.println("Puma");
						  break;
					 case 3 : System.out.println("Pantaloons");
						  break;
					 case 4 : System.out.println("Mufti");
						  break;
					 case 5 : System.out.println("Jaara");
						  break;
					 default : System.out.println("Any other brand");
						   break;
				 }
				 break;

			case 2 : 
			         System.out.println("What do you want to eat:");
		                 System.out.println("1.Pizza");
		                 System.out.println("2.Burger");
				 System.out.println("3.Ice-cream");
				 System.out.println("4.chat");
				 System.out.println("5.South-indian");

	                       	 
				 int choice1 = Integer.parseInt(br.readLine());

				 switch(choice1){
					 case 1 : System.out.println("Pizza");
						  break;
					 case 2 : System.out.println("Burger");
						  break;
					 case 3 : System.out.println("Ice-cream");
						  break;
					 case 4 : System.out.println("Chat");
						  break;
					 case 5 : System.out.println("South-indian");
						  break;
					 default : System.out.println("Any other food item");
						   break;
				 }
				 break;
		}
	}
}













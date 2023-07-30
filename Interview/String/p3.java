
import java.util.*;
class demo{

	static String Myreverse(String str){

		String arr[] = str.split(" ");
		String reverse = "";

		for(int i=0 ; i<arr.length; i++){

			String s = arr[i];
			String ans = "";

			for(int j=s.length()-1; j>=0; j--){

				ans += s.charAt(j);
			}

			reverse = reverse + ans + " ";
		}

		return reverse;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = sc.nextLine();

//		System.out.println("predefined method : " + str.reverse());
		System.out.println("userdefined method : " + Myreverse(str));	
	}
}

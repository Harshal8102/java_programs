
import java.util.*;
class demo{

	static String Myconcat(String []str){

		String ans = "";

		for(int i=0; i<str.length; i++){

			ans += str[i];
		}

		return ans;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no. of string to concat");
		int size = sc.nextInt(); 
		String str[] = new String[size];
		
		System.out.println("Enter the strings");

		for(int i=0 ; i < str.length ; i++){
			str[i] = sc.next();
		}

		System.out.println("concatenated string : " + Myconcat(str));	
	}
}

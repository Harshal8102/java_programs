
import java.util.*;
class Core{

	static String myStrToUpperCase(String str){

		char arr[] = str.toCharArray();
		
		for(int i =0 ; i < arr.length ; i++){
			
			if(arr[i] >= 97  &&  arr[i] <= 122){

				arr[i] = (char)(arr[i] - 32);
			}
		}	
		
		String ans = new String(arr);
		return ans;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = sc.next();

		System.out.println(myStrToUpperCase(str));
		System.out.println(str.toUpperCase());
	}
}


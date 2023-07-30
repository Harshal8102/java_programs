
import java.util.*;
class demo{

	static String Myreverse(String str){

		/*char arr[] = str.toCharArray();

		for(int i=0; i<arr.length/2 ; i++){

			char temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}*/

		String ans = "";

		for(int i=str.length()-1;i>=0; i--){

			ans += str.charAt(i);
		}

	//	str = new String(arr);
		return ans;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = sc.nextLine();
		System.out.println(str);

//		System.out.println("predefined method : " + str.reverse());
		System.out.println("userdefined method : " + Myreverse(str));	
	}
}


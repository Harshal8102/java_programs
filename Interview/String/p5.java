
import java.util.*;
class demo{

	static String capitalised(String str){
		
		char arr[] = str.toCharArray();

		if(arr[0] >= 97){
		       arr[0] = (char)(arr[0]-32);
		}
		for(int i=1; i<arr.length-1; i++){

			if((arr[i] == ' ') && (arr[i+1] >= 97)){
				arr[i+1] = (char)(arr[i+1]-32);
			}
		}
	 				
		String ans = new String(arr);
		return ans;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = sc.nextLine();


		System.out.println("String after capitalize : " + capitalised(str));	
	}
}

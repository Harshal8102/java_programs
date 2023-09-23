//Last index of one

import java.util.*;
class Demo{

	static int lastIndex(String s){

		char arr[] = s.toCharArray();
		for(int i=arr.length-1; i>=0; i--){

			if(arr[i] == 49){
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string");
		String s = sc.nextLine();

		System.out.println("last index of 1 : "  + lastIndex(s));
	}
}

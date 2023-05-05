/* program of method length() & method compareTo() by user define 
 * If Both character of both string are equal it returns 0
 * otherwise returns the difference ( diff in ascii values) */

import java.util.*;
class CompareToDemo{

	static int myStrLen(String str){

		char [] arr = str.toCharArray();
		int count = 0;
		for(int x : arr){
			count++;
		}

		return count;
	}

	static int myStrCompareTo(String str1, String str2){

		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();

		int x = 0;
		for(int i=0; i<arr1.length; i++){
			if(arr1[i] == arr2[i]){
				x = 0;
			}else{
				x = arr1[i] - arr2[i];
				break;
			}
		}
		return x;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first string :");
		String str1 = sc.next();

		System.out.println("Enter second String :");
		String str2 = sc.next();

		if(myStrLen(str1) == myStrLen(str2)){

			int x = myStrCompareTo(str1,str2);

			if(x == 0){
				System.out.println("Both strings are equal = " + x);
			}else{
				System.out.println("Difference = " + x);
			}
		}else{
			int ld = myStrLen(str1) - myStrLen(str2);

			System.out.println("Length difference between two strings = " + ld);
		}
	}
}

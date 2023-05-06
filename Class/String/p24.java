/* Concat() method of string by user define */

import java.util.Scanner;
class ConcatDemo{

	static String myStrConcat(String str1, String str2){

		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();

		char arr3[] = new char[arr1.length + arr2.length];
		for(int i=0; i<arr1.length; i++){
			arr3[i] = arr1[i];
		}
		for(int i=0; i<arr2.length; i++){
			arr3[i + arr1.length] = arr2[i];
		}
		String str3 = new String(arr3);

		return str3;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first string:");
		String str1 = sc.next();

		System.out.println("Enter second string");
		String str2 = sc.next();

		String str3 = myStrConcat(str1,str2);

		System.out.println(str3);
		System.out.println(str3.length());
	}
}




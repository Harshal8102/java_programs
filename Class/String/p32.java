
/* String substring(int index) method by user define */

import java.io.*;
class SubstringDemo{

	static String mySubString(String str, int x, int y){

		char arr[] = str.toCharArray();
		char arr2[] = new char[y-x];

		for(int i=0; i<arr2.length; i++){

			arr2[i] = arr[i+x];
		}

		String sstr = new String(arr2);
		return sstr;
	}

	static String SubString(String str, int x){

		char arr[] = str.toCharArray();
		char arr2[] = new char[arr.length-x];

		for(int i=0; i<arr2.length; i++){

			arr2[i] = arr[i+x];
		}

		String sstr = new String(arr2);
		return sstr;
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the string:");
		String str = br.readLine();

		System.out.println("Enter the index from which the string starts");
		int x = Integer.parseInt(br.readLine()); 

		System.out.println("Enetr the index of end of string:");
		int y = Integer.parseInt(br.readLine());


	        System.out.println("Substring of string is : " + mySubString(str,x,y));
	        System.out.println(str.substring(x,y));	
		System.out.println();		
		System.out.println("Substring of string is : " + SubString(str,x));
		System.out.println(str.substring(x));	
	       
	}
}


//print String in reverse order

import java.io.*;
class Recurrsion{
/*
	String reverseString(String s){

		char temp;

		char arr[] = s.toCharArray();

		for(int i=0; i<arr.length/2; i++){

			temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}

		String ans = new String(arr);

		return ans;
	}*/

	int i=0;
	String reverseString(String s){

		if(i == s.length())
			return "";

		char temp = s.charAt(i++);

		return reverseString(s) + temp;
	}

	public static void main(String[] args)throws IOException{

		Recurrsion obj = new Recurrsion();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the string");
		String s = br.readLine();

		System.out.println(obj.reverseString(s));
	}
}

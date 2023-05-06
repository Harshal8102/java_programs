/* charAt(int index) method of string by user define*/

import java.io.*;
class CharAtDemo{

	char myStrCharAt(String str,int i){

		char arr[] = str.toCharArray();
		char ch = arr[i];

		return ch;
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the String:");
		String str = br.readLine();

		System.out.println("Enter the index:");
		int in = Integer.parseInt(br.readLine());

		CharAtDemo obj = new CharAtDemo();

		System.out.println(obj.myStrCharAt(str,in));
	}
}



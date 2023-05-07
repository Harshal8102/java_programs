/* String replace(char oldChar, char newChar) method by user define */

import java.io.*;
class ReplaceDemo{

	static String myStrReplace(String str, char cho, char chn){

		char arr[] = str.toCharArray();

		for(int i=0; i<arr.length; i++){

			if(arr[i] == cho){

				arr[i] = chn;
			}
		}
		String rstr = new String(arr);

		return rstr;
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the string:");
		String str = br.readLine();

		System.out.println("Enter the old character to replace:");
		char cho = br.readLine().charAt(0);

		System.out.println("Enetr the new character to replace with old character:");
		char chn = br.readLine().charAt(0);

		System.out.println("Replace string is : " + myStrReplace(str,cho,chn));

		System.out.println(str.replace(cho,chn));
	}
}


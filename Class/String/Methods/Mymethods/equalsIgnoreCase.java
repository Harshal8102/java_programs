
/* boolean equalsIgnoreCase() method of string by user define*/

import java.io.*;
class EqualsIgnoreCaseDemo{

	static int myStrLen(String str){

		char []arr = str.toCharArray();

		return arr.length;
	}

	static boolean myStrEquals(String str1,String str2){

		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		boolean ans = true;
		
		for(int i=0; i<arr1.length; i++){
				
			if(arr1[i] == arr2[i] || arr1[i] == arr2[i]+32 || arr1[i] == arr2[i]-32){
				ans = true;
			}else{
				ans = false;
				break;
			}
		}
		return ans;
	}

	public static void main(String []arg)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter string 1:");
		String str1 = br.readLine();

		System.out.println("Enter string 2:");
		String str2 = br.readLine();

		if(myStrLen(str1) == myStrLen(str2)){

			System.out.println(myStrEquals(str1,str2));
		}else{
			System.out.println("false");
		}
	}
}


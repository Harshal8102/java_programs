/* compareToIgnoreCase() method by userdefine*/

import java.util.Scanner;
class CompareToIgnoreC{

	static int myStrLen(String str){

		char arr[] = str.toCharArray();

		return arr.length;
	}

	static int myStrCompToIgnoreCase(String str1, String str2){

		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();

		int x =0;

		if(myStrLen(str1) == myStrLen(str2)){

			for(int i=0; i<arr1.length; i++){

				if(arr1[i] == arr2[i] || arr1[i] == arr2[i]+32 || arr1[i] == arr2[i]-32 ){
					x = 0;
				}else{
					x = arr1[i] - arr2[i];
					break;
				}
			}

			return x;
			
		}else{

			x = myStrLen(str1) - myStrLen(str2);

			return x;
		}
	}

	public static void main(String arg[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter string 1:");
		String str1 = sc.next();

		System.out.println("Enter string 2:");
		String str2 = sc.next();

		System.out.println(myStrCompToIgnoreCase(str1,str2));
		System.out.println(str1.compareToIgnoreCase(str2));
	}
}



import java.util.*;
import java.io.*;
class demo{

	static void checkAnagram(String s1,String s2){

		char arr1[] = s1.toCharArray();
		char arr2[] = s2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		int x = 0;
		if(arr1.length == arr2.length){

			for(int i=0; i<arr1.length; i++){
				
				if(arr1[i] == arr2[i]){
					x=0;
				}else{
					x=1;
					break;
				}
			}
		}else{
			x=1;
		}
		if(x == 0){
			System.out.println("both strings are anagram");
		}else{
			System.out.println("not anagram");
		}
		
	}
	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the string1");
		String s1 = br.readLine();
		System.out.println("Enter the string2");
		String s2 = br.readLine();

		checkAnagram(s1,s2);
	}
}	


import java.io.*;
class StringDemo{

	static void myStrCheckPalindrome(String str){

		char arr[] = str.toCharArray();
		char rev[] = new char[arr.length];
		int j=0;
		for(int i=arr.length-1; i>=0; i--){

			rev[j++] = arr[i];
		}
		String revs = new String(rev);

		if(str.equals(revs) == true){

			System.out.println("String is palindrome");
		}else{
			System.out.println("String is not palindrome");
		}
	}


	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the string");
		String str = br.readLine();

		myStrCheckPalindrome(str);
	}
}

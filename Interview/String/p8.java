import java.io.*;
class demo{

	static String remove(String s, char ch){

		char arr[] = s.toCharArray();
		String ans = "";
		for(int i=0; i<arr.length; i++){
			
			if(arr[i] != ch){
				ans += arr[i];
			}
		}

		return ans;
	}

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the string");
		String s = br.readLine();

		System.out.println("Enter character to remove");
		char ch = br.readLine().charAt(0);

		System.out.println("String after removed char : " + remove(s,ch));
	}
}


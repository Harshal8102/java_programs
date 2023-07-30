//String palindrome or not


import java.io.*;
class demo{

	static String reverse(String s){

		char []arr = s.toCharArray();

		for(int i=0; i<arr.length/2; i++){

			char temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		
		String rev = new String(arr);
		return rev;
	}	

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the string");
		String s = br.readLine();

		String rev = reverse(s);
		System.out.println(rev);
		if(s.equals(rev) == true){
			System.out.println(s + " is palindrome string");
		}else{
			System.out.println(s + " is not palinrome");
		}
	}
}





	
import java.io.*;
class demo{

	static String remove(String s){

		char arr[] = s.toCharArray();
		for(int i=0; i<arr.length; i++){

			char ch = arr[i];

			for(int j=i+1; j<arr.length-1; j++){

				if(ch == arr[j]){
					arr[j] = 0;
				}
			}
		}
		String ans = "";
		for(int i=0; i<arr.length; i++){

			if(arr[i] != 0){
				ans += arr[i];
			}
		}
		return ans;
	}
	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the string");
		String s = br.readLine();

		System.out.println("Removed duplicate char : " + remove(s));
	}
}


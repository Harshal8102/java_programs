
import java.io.*;
class demo{

	static void countFrequency(String s){

		char arr[]= s.toCharArray();

		for(int i=0; i<arr.length; i++){

			char ch = arr[i];
			int count = 0;

			if(ch == ' ' || ch == '-'){
			}else{

				for(int j=0; j<arr.length; j++){

					if(ch == arr[j]){
						arr[j] = '-';
						count++;
					}
				}
				System.out.println(ch + " : " + count);
			}
		}
	}

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the string");
		String s = br.readLine();

		countFrequency(s);
	}
}


import java.io.*;
class SBDemo{

	static String myAppend(String str1,String str2){

		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		char ans[]  = new char[arr1.length + arr2.length];

		for(int i = 0; i<arr1.length ; i++){

			ans[i] = arr1[i];
		}
		for(int i=0; i<arr2.length ; i++){

			ans[i + arr1.length] = arr2[i];
		}

		String sb = new String(ans);
		return sb;
	}
			
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1 = new String(br.readLine());
		String str2 = new String(br.readLine());

		System.out.println(myAppend(str1,str2));
	}
}

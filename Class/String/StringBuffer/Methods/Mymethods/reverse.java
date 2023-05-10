import java.io.*;
class SBDemo{

	static StringBuffer myreverse(StringBuffer sb){

		String str = sb.toString();

		char arr[] = str.toCharArray();
		char ans[] = new char[arr.length];
		int j =0;

		for(int i=(arr.length-1); i>=0; i--){

			ans[j] = arr[i];
			j++;
		}

	        String rev = new String(ans);
		sb = new StringBuffer(rev);

		return sb;
	}	

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the string");
		StringBuffer str = new StringBuffer(br.readLine());
		System.out.println(System.identityHashCode(str));

		str = myreverse(str);
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
	}
}

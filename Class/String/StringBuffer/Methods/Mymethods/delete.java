import java.io.*;
class SBDemo{

	static StringBuffer myStrdelete(StringBuffer sb,int x, int y){

		String str = sb.toString();

		char arr[] = str.toCharArray();
		char ans[] = new char[arr.length - (y-x)];
		int j=0;

		for(int i=0; i<arr.length; i++){

			if(i<x || i>=y){

				ans[j] = arr[i];
				j++;
			}
		}

		String str1 = new String(ans);
		StringBuffer sbs = new StringBuffer(str1);

		return sbs;
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the string:");
		StringBuffer sb = new StringBuffer(br.readLine());

		System.out.println("Enter the start & end index to delete the substring");
		int st = Integer.parseInt(br.readLine());
	        int ed = Integer.parseInt(br.readLine());

		System.out.println(myStrdelete(sb,st,ed));
	}
}	



//Form largest number from digits
import java.util.*;
import java.io.*;
class Demo{


	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter no. of elements");
		int n = Integer.parseInt(br.readLine());

		int arr[] = new int[n];

		ArrayList al = new ArrayList();
		for(int i = 0; i<n; i++){
			arr[i] = Integer.parseInt(br.readLine());
			al.add(arr[i]);
		}

		Collections.sort(al,Collections.reverseOrder());

		long ans = 0;
		for(int i=0;i<al.size(); i++){

			ans = ans * 10 + (int)al.get(i);
		}
		System.out.println(ans);	
	}
}

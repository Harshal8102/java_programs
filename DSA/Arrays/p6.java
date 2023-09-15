//Elements in the range
import java.io.*;
import java.util.*;
class Demo{

	static boolean checkElements(int arr[],int a,int b){

		if(a > b)
			return false;

		/*for(int i=a; i<=b; i++){

			boolean found = false;

			for(int j=0; j<arr.length; j++){

				if(i == arr[j]){
					found = true;
					break;
				}
			}

			if(!found){
				return false;
			}
		}

		return true;*/

		Set<Integer> s = new HashSet<>();
		for(int i=0; i<arr.length; i++){
			s.add(arr[i]);
		}
		for(int i=a; i<= b; i++){
			if(!s.contains(i)){
				return false;
			}
		}
		return true;		
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter no. of elements");
		int n = Integer.parseInt(br.readLine());

		int arr[] = new int[n];

		for(int i = 0; i<n; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Enter A ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter B ");
		int b = Integer.parseInt(br.readLine());

		if(checkElements(arr,a,b)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
	}
}

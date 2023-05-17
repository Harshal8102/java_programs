import java.util.*;
class Core{

	static void myStrSplit(String str, String del){

		char arr1[] = str.toCharArray();
		char d[] = del.toCharArray();
		String []ans = new String[10];
		int j = 0;

		for(int i=0; i<arr1.length; i++){

			if(arr1[i] != d[0]){

			      ans[j] = "" + arr1[i];
			}else{
				j++;
			}
		}

		for(int i=0; i<ans.length; i++){

			System.out.println(ans[i]);
		}
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = sc.nextLine();

		System.out.println("Enter the delimeter to break the string");
		String del = sc.nextLine();

		myStrSplit(str,del);

	}
}



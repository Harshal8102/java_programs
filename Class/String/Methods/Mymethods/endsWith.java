import java.util.*;
class Core{

	static boolean myStrEndsWith(String str,String ps){

		char arr[] = str.toCharArray();
		char prs[] = ps.toCharArray();
		int y=0;
	        int j = prs.length-1;	
		for(int i = arr.length - 1 ; i >= arr.length-prs.length ; i--){

			if(arr[i] == prs[j]){

				y=0;
			}else{
				y=1;
			}
			j--;
		}	
		
		if(y == 0){
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = sc.nextLine();

		System.out.println("Enter the prefix string to compare");
		String ps = sc.nextLine();

		System.out.println(myStrEndsWith(str,ps));
		System.out.println(str.endsWith(ps));
	}
}


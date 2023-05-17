
import java.util.*;
class Core{

	static String myStrTrim(String str){

		char arr[] = str.toCharArray();
		int x = 0;
		int y = arr.length;

	        for(int i=0; i<arr.length; i++){

			if(arr[i] == 32){
				x++;
			}else{
				break;
			}
		}	
		for(int i=arr.length-1; i>=0; i--){
			if(arr[i] == 32){
				y--;
			}else{
				break;
			}
		}

		
		String ans = "";
		for(  ; x<y ; x++){
			ans += arr[x];
		}

		return ans;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = sc.nextLine();

		System.out.println(myStrTrim(str));
		System.out.println(str.trim());
	}
}


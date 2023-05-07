
/* lastIndexOf(char ch,int uptoIndex) method of string by user define*/

import java.util.Scanner;
class LastIndexOfDemo{

	static int LastIndexOf(String str, char ch, int in){

		char arr[] = str.toCharArray();

		for(int i=in; i>=0; i--){

			if(arr[i] == ch){
				
				in = i;
				break;
			}else{
				in = -1;
			}
		}
		return in;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = sc.nextLine();

		System.out.println("Enter the character to find:");
		char ch = sc.nextLine().charAt(0);

		System.out.println("Enter the index ");
		int in = sc.nextInt();

		System.out.println("Index is = " + LastIndexOf(str,ch,in));
		System.out.println(str.lastIndexOf(ch,in));

	}
}


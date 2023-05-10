/* indexOf(char ch,int fromIndex) method of string by user define*/

import java.util.Scanner;
class IndexOfDemo{

	static int IndexOf(String str, char ch, int in){

		char arr[] = str.toCharArray();

		for(int i=in; i<arr.length; i++){

			if(arr[i] == ch){
				
				in = i;
				break;
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

		System.out.println("Enter the index from which to start the search");
		int in = sc.nextInt();

		System.out.println("Index is = " + IndexOf(str,ch,in));
	}
}




//determine whether s is a prefix string of words

import java.util.*;
class Demo{

	static boolean checkPrefixString(String s,String[] words,int n){

		String ans = "";

		for(int i=0; i<n; i++){

			ans += words[i];
			
			if(ans.equals(s))
				return true;

			if(s.charAt(0) != ans.charAt(0))
				return false;
		}

		return false;
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String s");
		String s = sc.nextLine();

		System.out.println("Enter words array");
		int n = sc.nextInt();
		String words[] = new String[n];
		for(int i=0; i<n; i++){
			words[i] = sc.next();
		}

		System.out.println(checkPrefixString(s,words,n));
	}
}

		

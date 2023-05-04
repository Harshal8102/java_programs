import java.util.Scanner;
class ToCharArrayDemo{

	static int myStrLen(String str){

		char arr[] = str.toCharArray();

		return arr.length;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first string");
		String str1 = sc.next();

		System.out.println("Enter second string");
		String str2 = sc.next();

		if(myStrLen(str1) == myStrLen(str2)){

			System.out.println("Length equal");
		}else{
			System.out.println("Length not equal");
		}
	}
}


		

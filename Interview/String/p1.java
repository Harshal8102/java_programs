import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		String arr[] = new String[5];

		System.out.println("Enter the string in array");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextLine();
		}

		System.out.println("Enter the String");
		String str = sc.nextLine();

		for(int i=0; i<arr.length; i++){

			if(arr[i].equals(str)){
				System.out.println("String found at index : " + i);
			}
		}
	}
}


			

import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		char arr[] = new char[8];
		for(int i=0; i<arr.length; i++){

			arr[i] = sc.next().charAt(0);

			if(arr[i]=='a' || arr[i] == 'e'|| arr[i] == 'i'|| arr[i] == 'o'|| arr[i] == 'u' ){

				arr[i] -= 32;
			}else if(arr[i]=='A' || arr[i] == 'E'|| arr[i] == 'I'|| arr[i] == 'O'|| arr[i] == 'U' ){

				arr[i] += 32;
			}

		}

		for(char x : arr){
			System.out.println(x + "   ");
		}
	}
}



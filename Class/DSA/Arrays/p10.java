//Character array(lowercase)
//Return count of pairs(i,j) such that
//a) i<j
//b) a[i] = 'a'  a[j] = 'g'

import java.util.*;
class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter char array & size");
		int n = sc.nextInt();

		char arr[] = new char[n];

		for(int i=0; i<n; i++)
			arr[i] = sc.next().charAt(0);

		int count = 0,c=0;
/*
		for(int i=0; i<n-1; i++){

			if(arr[i] == 'a'){

				for(int j=i+1; j<n; j++){
					if(arr[j] == 'g')
						count++;
				}
			}
		}*/
		for(int i=0; i<n; i++){
			if(arr[i] == 'a')
				c++;
			if(arr[i] == 'g')
				count += c;
		}

		System.out.println(count);
	}
}
		

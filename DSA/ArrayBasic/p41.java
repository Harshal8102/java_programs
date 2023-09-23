
import java.util.*;
class Demo{

	static int noOfElements(int arr[],int n,int num1,int num2){

		int count = 0;

		int st = 0,en = n-1;

		while(arr[st] != num1 ||  arr[en] != num2){

			if(arr[st] != num1){
				count++;
				st++;
			}
			else if(arr[en] != num2){
				count++;
				en--;
			}
		}
		count += 2;

		return  (n-count<0) ? 0 : n-count ;
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array");
		int m = sc.nextInt();
		int arr[] = new int[m];
		for(int i=0; i<m; i++){
			arr[i] = sc.nextInt();
		}

		System.out.println("enter num 1");
		int num1 = sc.nextInt();
		System.out.println("enter num 2 ");
		int num2 = sc.nextInt();

   		System.out.println("no. of elements between this numbers are : " + noOfElements(arr,m,num1,num2));

	}
}

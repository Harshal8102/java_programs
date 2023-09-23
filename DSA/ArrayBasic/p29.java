
import java.util.*;
class Demo{

	static int findClosest(int arr[],int m,int k){

		int lt = 0,rt = 0;

		int st = 0,en = m-1;
		while(arr[st]<k || arr[en]>k){
			
			if(arr[st]<k){
				lt = arr[st];
				st++;
			}
			if(arr[en] > k){
			       rt = arr[en];
		      		en--;
			}		
		}
		if(k-lt < rt-k){
			return lt;
		}else{
			return rt;
		}
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array");
		int m = sc.nextInt();
		int arr[] = new int[m];
		for(int i=0; i<m; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter number k");
		int k = sc.nextInt();

		System.out.println(findClosest(arr,m,k));
	}
}

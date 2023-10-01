//Find all pairs with given sum

import java.util.*;
class Demo{

	static void findPairs(int a[],int n,int b[],int m,int x){

		HashMap<Integer,Integer> hm = new HashMap<>();

		/*brute force
		 * for(int i=0; i<n; i++){

			for(int j=0; j<m; j++){

				if((a[i] + b[j]) == x){
					hm.put(a[i] , b[j]);
				}
			}
		}*/
		HashMap<Integer,Integer> ans = new HashMap<>();

		for(int i=0; i<n; i++){
			hm.put(a[i],0);
		}

		for(int j=0; j<m; j++){

			if(hm.containsKey(x - b[j])){
				ans.put(x-b[j],b[j]);
			}
		}

		Set data = ans.entrySet();

		Iterator<Map.Entry> itr = data.iterator();

		while(itr.hasNext()){

			Map.Entry abc = itr.next();

			System.out.println("(" + abc.getKey() + "   "+ abc.getValue() +")");
		}
		
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println("Enter array 2");
		int m = sc.nextInt();
		int arr2[] = new int[m];

		for(int i=0; i<m; i++)
			arr2[i] = sc.nextInt();

		System.out.println("Enter value of x");
		int x = sc.nextInt();

		findPairs(arr , n , arr2 ,m , x);
	}
}

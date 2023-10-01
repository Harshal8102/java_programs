//Non Repeating Element

import java.util.*;
class Demo{

	static int nonRepeatElement(int arr[],int n){

	/*HashMap<Integer,Integer> hm = new HashMap<>();

		for(int i=0; i<n; i++){
			if(hm.containsKey(arr[i])){
				hm.put(arr[i],hm.get(arr[i])+1);
			}else{
				hm.put(arr[i],1);
			}
		}

		for(int i=0; i<n; i++){

			if(hm.get(arr[i]) == 1){
				return arr[i];
			}
		}*/
		int temp=0;
		Arrays.sort(arr);
		for(int i=0; i<n-1; i++){
			if(arr[i] != arr[i+1] && arr[i] != temp)
				return arr[i];

			if(arr[i] == arr[i+1])
				temp = arr[i];
		}
		if(arr[n-1] != arr[n-2])
			return arr[n-1];

		return 0;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println("non repeating element : " + nonRepeatElement(arr,n));
	}
}

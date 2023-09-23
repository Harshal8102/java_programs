
import java.util.*;
class Demo{

	static int findOddOcc(int arr[],int n){

	//	Arrays.sort(arr);
		int count = 1;
		int odd = 0;
		/*for(int i=0;i<n-1; i++){

			if(arr[i] == arr[i+1]){
				count++;
			}else{
				if(count%2 != 0){
					odd = arr[i];
					break;
				}
				count = 1;
			}

			if(i == n-2 && count%2!= 0){
				odd = arr[i];
			}
		}*/

		HashMap<Integer,Integer> hm = new HashMap<>();

		for(int i=0; i<n; i++){

			if(hm.containsKey(arr[i])){
				
				hm.put(arr[i],hm.get(arr[i]) + 1);
			}else{
				hm.put(arr[i],1);
			}
		}
		for(Integer a : hm.keySet()){
			if(hm.get(a) % 2 != 0){
				return a;
			}
		}		

		//System.out.println(odd + " occurs " + count + " times");
		return -1;
	}
					
	public static void main(String[] args){

		int arr[] = {5,7,2,7,5,2,5};
		int n = 7;

		System.out.println(findOddOcc(arr,n));
	}
}
